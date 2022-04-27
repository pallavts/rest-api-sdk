# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""


class FromUserNameAndIDInput(object):

    """Implementation of the 'FromUserNameAndIDInput' model.

    A JSON object of name or GUIDs of the current owner of the objects. When
    both are given then id is considered. 
    If a list of object ids are provided as input for TsObjectId, then only
    for those ids that have owner as the value provided in fromUser, the owner
    will be changed. 
    Provide either name or id as input. When both are given user id will be
    considered.

    Attributes:
        name (string): Username of the user
        id (string): GUID of the user

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "name": 'name',
        "id": 'id'
    }

    def __init__(self,
                 name=None,
                 id=None):
        """Constructor for the FromUserNameAndIDInput class"""

        # Initialize members of the class
        self.name = name
        self.id = id

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
        # Return an object of this model
        return cls(name,
                   id)
