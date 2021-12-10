# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from restapisdk.models.group_name_and_id_input import GroupNameAndIDInput


class ApiRestV2UserSearchRequest(object):

    """Implementation of the 'Api Rest V2 User Search Request' model.

    TODO: type model description here.

    Attributes:
        name (string): Name of the user.
        id (string): The GUID of the user account to query
        display_name (string): A unique display name string for the user,
            usually their first and last name.
        visibility (VisibilityEnum): Visibility of the user. The visibility
            attribute is set to DEFAULT when creating a user. Setting this to
            DEFAULT makes a user visible to other users and user groups, and
            thus allows them to share objects
        mail (string): email of the user account
        groups (list of GroupNameAndIDInput): A JSON array of group names or
            GUIDs or both. When both are given then id is considered
        privileges (list of PrivilegeEnum): A JSON array of privileges
            assigned to the user
        state (StateEnum): Status of user account. acitve or inactive.
        notify_on_share (NotifyOnShareEnum): User preference for receiving
            email notifications when another ThoughtSpot user shares answers
            or pinboards.
        show_walk_me (ShowWalkMeEnum): The user preference for revisiting the
            onboarding experience.
        analyst_onboarding_complete (AnalystOnboardingCompleteEnum):
            ThoughtSpot provides an interactive guided walkthrough to onboard
            new users. The onboarding experience leads users through a set of
            actions to help users get started and accomplish their tasks
            quickly. The users can turn off the Onboarding experience and
            access it again when they need assistance with the ThoughtSpot
            UI.
        mtype (Type2Enum): Type of user. LOCAL_USER indicates that the user is
            created locally in the ThoughtSpot system.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "name": 'name',
        "id": 'id',
        "display_name": 'displayName',
        "visibility": 'visibility',
        "mail": 'mail',
        "groups": 'groups',
        "privileges": 'privileges',
        "state": 'state',
        "notify_on_share": 'notifyOnShare',
        "show_walk_me": 'showWalkMe',
        "analyst_onboarding_complete": 'analystOnboardingComplete',
        "mtype": 'type'
    }

    def __init__(self,
                 name=None,
                 id=None,
                 display_name=None,
                 visibility='DEFAULT',
                 mail=None,
                 groups=None,
                 privileges=None,
                 state=None,
                 notify_on_share=None,
                 show_walk_me=None,
                 analyst_onboarding_complete=None,
                 mtype=None):
        """Constructor for the ApiRestV2UserSearchRequest class"""

        # Initialize members of the class
        self.name = name
        self.id = id
        self.display_name = display_name
        self.visibility = visibility
        self.mail = mail
        self.groups = groups
        self.privileges = privileges
        self.state = state
        self.notify_on_share = notify_on_share
        self.show_walk_me = show_walk_me
        self.analyst_onboarding_complete = analyst_onboarding_complete
        self.mtype = mtype

    @classmethod
    def from_dictionary(cls,
                        dictionary):
        """Creates an instance of this model from a dictionary

        Args:
            dictionary (dictionary): A dictionary representation of the object
            as obtained from the deserialization of the server's response. The
            keys MUST match property names in the API description.

        Returns:
            object: An instance of this structure class.

        """
        if dictionary is None:
            return None

        # Extract variables from the dictionary
        name = dictionary.get('name')
        id = dictionary.get('id')
        display_name = dictionary.get('displayName')
        visibility = dictionary.get("visibility") if dictionary.get("visibility") else 'DEFAULT'
        mail = dictionary.get('mail')
        groups = None
        if dictionary.get('groups') is not None:
            groups = [GroupNameAndIDInput.from_dictionary(x) for x in dictionary.get('groups')]
        privileges = dictionary.get('privileges')
        state = dictionary.get('state')
        notify_on_share = dictionary.get('notifyOnShare')
        show_walk_me = dictionary.get('showWalkMe')
        analyst_onboarding_complete = dictionary.get('analystOnboardingComplete')
        mtype = dictionary.get('type')

        # Return an object of this model
        return cls(name,
                   id,
                   display_name,
                   visibility,
                   mail,
                   groups,
                   privileges,
                   state,
                   notify_on_share,
                   show_walk_me,
                   analyst_onboarding_complete,
                   mtype)

    @classmethod
    def validate(cls, val):
        """Validates value against class schema

        Args:
            val: the value to be validated

        Returns:
            boolean : if value is valid against schema.

        """
        return SchemaValidatorWrapper.getValidator(APIHelper.get_schema_path(os.path.abspath(__file__))).is_valid(val)
