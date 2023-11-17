package p341ge.bog.chat.data.entitiy;

import androidx.annotation.Keep;

@Keep
/* renamed from: ge.bog.chat.data.entitiy.Operation */
public enum Operation {
    REQUEST_CHAT,
    REQUEST_NOTIFICATIONS,
    SEND_MESSAGE,
    READ_RECEIPT,
    START_TYPING,
    STOP_TYPING,
    DISCONNECT,
    PUSH_URL,
    UPDATE_NICKNAME,
    CUSTOM_NOTICE,
    UPDATE_USER_DATA,
    NOTICE,
    GET_FILE_LIMITS,
    DELETE_FILE,
    UPLOAD_FILE
}
