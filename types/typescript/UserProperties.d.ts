/* tslint:disable */
/**
 * This file was automatically generated by json-schema-to-typescript.
 * DO NOT MODIFY IT BY HAND. Instead, modify the source JSONSchema file,
 * and run json-schema-to-typescript to regenerate this file.
 */

/**
 * The user properties to apply when identifying. This is not an event definition. These properties must all be device independent.
 */
export interface UserProperties {
  /**
   * The selected messaging use case during the onboarding flow.
   */
  ftueUseCaseSelection?: ("PersonalMessaging" | "WorkMessaging" | "CommunityMessaging" | "Skip") & string;
  /**
   * Number of spaces (and sub-spaces) the user is joined to
   */
  numSpaces?: number;
  /**
   * Whether the user has the home space enabled
   */
  WebMetaSpaceHomeEnabled?: boolean;
  /**
   * Whether the user has the home space set to all rooms
   */
  WebMetaSpaceHomeAllRooms?: boolean;
  /**
   * Whether the user has the people space enabled
   */
  WebMetaSpacePeopleEnabled?: boolean;
  /**
   * Whether the user has the favourites space enabled
   */
  WebMetaSpaceFavouritesEnabled?: boolean;
  /**
   * Whether the user has the other rooms space enabled
   */
  WebMetaSpaceOrphansEnabled?: boolean;
}
