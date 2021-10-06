# -*- coding: utf-8 -*-

"""
tspublicrestapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""


class ApiRestV2SessionLoginRequest(object):

    """Implementation of the 'Api Rest V2 Session Login Request' model.

    TODO: type model description here.

    Attributes:
        user_name (string): TODO: type description here.
        password (string): TODO: type description here.
        remember_me (bool): TODO: type description here.
        token_type (TokenTypeEnum): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "user_name": 'userName',
        "password": 'password',
        "remember_me": 'rememberMe',
        "token_type": 'tokenType'
    }

    def __init__(self,
                 user_name=None,
                 password=None,
                 remember_me=None,
                 token_type=None):
        """Constructor for the ApiRestV2SessionLoginRequest class"""

        # Initialize members of the class
        self.user_name = user_name
        self.password = password
        self.remember_me = remember_me
        self.token_type = token_type

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
        user_name = dictionary.get('userName')
        password = dictionary.get('password')
        remember_me = dictionary.get('rememberMe')
        token_type = dictionary.get('tokenType')

        # Return an object of this model
        return cls(user_name,
                   password,
                   remember_me,
                   token_type)
