/*
 * Copyright (c) 2021 New Vector Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package im.vector.app.features.analytics.plan

import im.vector.app.features.analytics.itf.VectorAnalyticsEvent

// GENERATED FILE, DO NOT EDIT. FOR MORE INFORMATION VISIT
// https://github.com/matrix-org/matrix-analytics-events/

/**
 * Triggered when the user clicks/taps/activates a UI element.
 */
data class Interaction(
        /**
         * The index of the element, if its in a list of elements.
         */
        val index: Int? = null,
        /**
         * The manner with which the user activated the UI element.
         */
        val interactionType: InteractionType? = null,
        /**
         * The unique name of this element.
         */
        val name: Name,
) : VectorAnalyticsEvent {

    enum class Name {
        /**
         * User accessed the room invite flow using the button at the top of the
         * room member list in the right panel of Element Web/Desktop.
         */
        WebRightPanelMemberListInviteButton,

        /**
         * User accessed room member list using the 'People' button in the right
         * panel room summary card of Element Web/Desktop.
         */
        WebRightPanelRoomInfoPeopleButton,

        /**
         * User accessed room settings using the 'Settings' button in the right
         * panel room summary card of Element Web/Desktop.
         */
        WebRightPanelRoomInfoSettingsButton,

        /**
         * User accessed room member list using the back button in the right
         * panel user info card of Element Web/Desktop.
         */
        WebRightPanelRoomUserInfoBackButton,

        /**
         * User invited someone to room by clicking invite on the right panel
         * user info card in Element Web/Desktop.
         */
        WebRightPanelRoomUserInfoInviteButton,

        /**
         * User adjusted their favourites using the context menu on the header
         * of a room in Element Web/Desktop.
         */
        WebRoomHeaderContextMenuFavouriteToggle,

        /**
         * User accessed the room invite flow using the context menu on the
         * header of a room in Element Web/Desktop.
         */
        WebRoomHeaderContextMenuInviteItem,

        /**
         * User interacted with leave action in the context menu on the header
         * of a room in Element Web/Desktop.
         */
        WebRoomHeaderContextMenuLeaveItem,

        /**
         * User accessed their room notification settings via the context menu
         * on the header of a room in Element Web/Desktop.
         */
        WebRoomHeaderContextMenuNotificationsItem,

        /**
         * User accessed room member list using the context menu on the header
         * of a room in Element Web/Desktop.
         */
        WebRoomHeaderContextMenuPeopleItem,

        /**
         * User accessed room settings using the context menu on the header of a
         * room in Element Web/Desktop.
         */
        WebRoomHeaderContextMenuSettingsItem,

        /**
         * User adjusted their favourites using the context menu on a room tile
         * in the room list in Element Web/Desktop.
         */
        WebRoomListRoomTileContextMenuFavouriteToggle,

        /**
         * User accessed the room invite flow using the context menu on a room
         * tile in the room list in Element Web/Desktop.
         */
        WebRoomListRoomTileContextMenuInviteItem,

        /**
         * User interacted with leave action in the context menu on a room tile
         * in the room list in Element Web/Desktop.
         */
        WebRoomListRoomTileContextMenuLeaveItem,

        /**
         * User accessed room settings using the context menu on a room tile in
         * the room list in Element Web/Desktop.
         */
        WebRoomListRoomTileContextMenuSettingsItem,

        /**
         * User accessed their room notification settings via the context menu
         * on a room tile in the room list in Element Web/Desktop.
         */
        WebRoomListRoomTileNotificationsMenu,

        /**
         * User interacted with leave action in the general tab of the room
         * settings dialog in Element Web/Desktop.
         */
        WebRoomSettingsLeaveButton,
    }

    enum class InteractionType {
        Keyboard,
        Pointer,
        Touch,
    }

    override fun getName() = "Interaction"

    override fun getProperties(): Map<String, Any?>? {
        return mutableMapOf<String, Any?>().apply {
            put("index", index)
            put("interactionType", interactionType?.name)
            put("name", name.name)
        }
    }
}
