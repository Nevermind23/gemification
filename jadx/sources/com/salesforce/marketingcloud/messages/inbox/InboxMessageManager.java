package com.salesforce.marketingcloud.messages.inbox;

import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.MCKeep;
import java.util.List;

@MCKeep
public interface InboxMessageManager {
    public static final String TAG = C11461g.m41875a("InboxMessageManager");

    @MCKeep
    public interface InboxRefreshListener {
        void onRefreshComplete(boolean z);
    }

    @MCKeep
    public interface InboxResponseListener {
        void onInboxMessagesChanged(List<InboxMessage> list);
    }

    void deleteMessage(InboxMessage inboxMessage);

    void deleteMessage(String str);

    int getDeletedMessageCount();

    List<InboxMessage> getDeletedMessages();

    int getMessageCount();

    List<InboxMessage> getMessages();

    int getReadMessageCount();

    List<InboxMessage> getReadMessages();

    int getUnreadMessageCount();

    List<InboxMessage> getUnreadMessages();

    void markAllMessagesDeleted();

    void markAllMessagesRead();

    void refreshInbox(InboxRefreshListener inboxRefreshListener);

    void registerInboxResponseListener(InboxResponseListener inboxResponseListener);

    void setMessageRead(InboxMessage inboxMessage);

    void setMessageRead(String str);

    void unregisterInboxResponseListener(InboxResponseListener inboxResponseListener);
}
