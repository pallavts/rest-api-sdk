# -*- coding: utf-8 -*-

"""
tspublicrestapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from tspublicrestapi.models.author_properties import AuthorProperties
from tspublicrestapi.models.modified_properties import ModifiedProperties
from tspublicrestapi.models.owener_properties import OwenerProperties


class CreateUserResponce(object):

    """Implementation of the 'CreateUserResponce' model.

    TODO: type model description here.

    Attributes:
        name (string): Username of the user account
        display_name (string): Display name of the user account
        id (string): GUID of the user account
        visibility (VisibilityEnum): Visibility of the user account
        mail (string): Email of the user account
        groups (list of string): Username of the owner of the user account
        privileges (list of string): Privileges assigned to user account
        tags (list of string): TODO: type description here.
        state (StateEnum): Indicates if the user account is active or
            inactive
        notify_on_share (bool): Indicates if the email should be sent when
            object is shared with the user
        show_walk_me (bool): Indicates if the walk me should be shown when
            logging in
        analyst_onboarding_complete (bool): Indicates if the onboarding is
            completed for the user
        first_login (int): Indicates if the use is logging in for the first
            time
        welcome_email_sent (bool): Indicates if the welcome email is sent to
            email associated with the user account
        is_deleted (bool): Indicates if the user account is deleted
        is_hidden (bool): Indicates if the user account is hidden
        is_external (bool): Indicates if the user account is from external
            system
        is_deprecated (bool): TODO: type description here.
        complete (bool): Indicates if the all the properties of user account
            is provided
        is_super_user (bool): Indicates if the user account is super user
        is_system_principal (bool): Indicates if the user account is system
            principal
        mtype (TypeEnum): Indicates the type of user account
        parenttype (string): Indicates the type of parent object
        tenant_id (string): Tenant id associated with the user account
        index_version (int): TODO: type description here.
        generation_num (int): TODO: type description here.
        created (float): Date and time when user account was created
        modified (float): Date and time of last modification of user account
        author (AuthorProperties): TODO: type description here.
        modified_by (ModifiedProperties): TODO: type description here.
        owner (OwenerProperties): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "name": 'name',
        "display_name": 'displayName',
        "id": 'id',
        "visibility": 'visibility',
        "mail": 'mail',
        "groups": 'groups',
        "privileges": 'privileges',
        "tags": 'tags',
        "state": 'state',
        "notify_on_share": 'notifyOnShare',
        "show_walk_me": 'showWalkMe',
        "analyst_onboarding_complete": 'analystOnboardingComplete',
        "first_login": 'firstLogin',
        "welcome_email_sent": 'welcomeEmailSent',
        "is_deleted": 'isDeleted',
        "is_hidden": 'isHidden',
        "is_external": 'isExternal',
        "is_deprecated": 'isDeprecated',
        "complete": 'complete',
        "is_super_user": 'isSuperUser',
        "is_system_principal": 'isSystemPrincipal',
        "mtype": 'type',
        "parenttype": 'parenttype',
        "tenant_id": 'tenantId',
        "index_version": 'indexVersion',
        "generation_num": 'generationNum',
        "created": 'created',
        "modified": 'modified',
        "author": 'author',
        "modified_by": 'modifiedBy',
        "owner": 'owner'
    }

    def __init__(self,
                 name=None,
                 display_name=None,
                 id=None,
                 visibility=None,
                 mail=None,
                 groups=None,
                 privileges=None,
                 tags=None,
                 state=None,
                 notify_on_share=None,
                 show_walk_me=None,
                 analyst_onboarding_complete=None,
                 first_login=None,
                 welcome_email_sent=None,
                 is_deleted=None,
                 is_hidden=None,
                 is_external=None,
                 is_deprecated=None,
                 complete=None,
                 is_super_user=None,
                 is_system_principal=None,
                 mtype=None,
                 parenttype=None,
                 tenant_id=None,
                 index_version=None,
                 generation_num=None,
                 created=None,
                 modified=None,
                 author=None,
                 modified_by=None,
                 owner=None):
        """Constructor for the CreateUserResponce class"""

        # Initialize members of the class
        self.name = name
        self.display_name = display_name
        self.id = id
        self.visibility = visibility
        self.mail = mail
        self.groups = groups
        self.privileges = privileges
        self.tags = tags
        self.state = state
        self.notify_on_share = notify_on_share
        self.show_walk_me = show_walk_me
        self.analyst_onboarding_complete = analyst_onboarding_complete
        self.first_login = first_login
        self.welcome_email_sent = welcome_email_sent
        self.is_deleted = is_deleted
        self.is_hidden = is_hidden
        self.is_external = is_external
        self.is_deprecated = is_deprecated
        self.complete = complete
        self.is_super_user = is_super_user
        self.is_system_principal = is_system_principal
        self.mtype = mtype
        self.parenttype = parenttype
        self.tenant_id = tenant_id
        self.index_version = index_version
        self.generation_num = generation_num
        self.created = created
        self.modified = modified
        self.author = author
        self.modified_by = modified_by
        self.owner = owner

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
        display_name = dictionary.get('displayName')
        id = dictionary.get('id')
        visibility = dictionary.get('visibility')
        mail = dictionary.get('mail')
        groups = dictionary.get('groups')
        privileges = dictionary.get('privileges')
        tags = dictionary.get('tags')
        state = dictionary.get('state')
        notify_on_share = dictionary.get('notifyOnShare')
        show_walk_me = dictionary.get('showWalkMe')
        analyst_onboarding_complete = dictionary.get('analystOnboardingComplete')
        first_login = dictionary.get('firstLogin')
        welcome_email_sent = dictionary.get('welcomeEmailSent')
        is_deleted = dictionary.get('isDeleted')
        is_hidden = dictionary.get('isHidden')
        is_external = dictionary.get('isExternal')
        is_deprecated = dictionary.get('isDeprecated')
        complete = dictionary.get('complete')
        is_super_user = dictionary.get('isSuperUser')
        is_system_principal = dictionary.get('isSystemPrincipal')
        mtype = dictionary.get('type')
        parenttype = dictionary.get('parenttype')
        tenant_id = dictionary.get('tenantId')
        index_version = dictionary.get('indexVersion')
        generation_num = dictionary.get('generationNum')
        created = dictionary.get('created')
        modified = dictionary.get('modified')
        author = AuthorProperties.from_dictionary(dictionary.get('author')) if dictionary.get('author') else None
        modified_by = ModifiedProperties.from_dictionary(dictionary.get('modifiedBy')) if dictionary.get('modifiedBy') else None
        owner = OwenerProperties.from_dictionary(dictionary.get('owner')) if dictionary.get('owner') else None

        # Return an object of this model
        return cls(name,
                   display_name,
                   id,
                   visibility,
                   mail,
                   groups,
                   privileges,
                   tags,
                   state,
                   notify_on_share,
                   show_walk_me,
                   analyst_onboarding_complete,
                   first_login,
                   welcome_email_sent,
                   is_deleted,
                   is_hidden,
                   is_external,
                   is_deprecated,
                   complete,
                   is_super_user,
                   is_system_principal,
                   mtype,
                   parenttype,
                   tenant_id,
                   index_version,
                   generation_num,
                   created,
                   modified,
                   author,
                   modified_by,
                   owner)
