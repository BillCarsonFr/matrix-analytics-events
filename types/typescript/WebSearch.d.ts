/* tslint:disable */
/**
 * This file was automatically generated by json-schema-to-typescript.
 * DO NOT MODIFY IT BY HAND. Instead, modify the source JSONSchema file,
 * and run json-schema-to-typescript to regenerate this file.
 */

/**
 * Triggered when the user searches rooms.
 */
export interface WebSearch {
  eventName: "WebSearch";
  /**
   * Whether the user is using the new search experience beta.
   */
  viaSpotlight: boolean;
  /**
   * How many results the user got to their query.
   */
  numResults: number;
  /**
   * The length of the user's query.
   */
  queryLength: number;
}
