package p341ge.bog.mobilebank.model.notification;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p277ua.C8662a;
import p277ua.C8664c;

/* renamed from: ge.bog.mobilebank.model.notification.ProcessNotificationsRequest */
public class ProcessNotificationsRequest {
    @C8662a
    @C8664c("jsonRequest")
    private List<ProcessNotificationRequest> requests;

    /* renamed from: ge.bog.mobilebank.model.notification.ProcessNotificationsRequest$Builder */
    public static class Builder {
        private List<ProcessNotificationRequest> requests = new ArrayList();

        public Builder addRequest(ProcessNotificationRequest processNotificationRequest) {
            this.requests.add(processNotificationRequest);
            return this;
        }

        public ProcessNotificationsRequest build() {
            Collections.sort(this.requests, new Comparator<ProcessNotificationRequest>() {
                public int compare(ProcessNotificationRequest processNotificationRequest, ProcessNotificationRequest processNotificationRequest2) {
                    return processNotificationRequest2.getIndexInList() - processNotificationRequest.getIndexInList();
                }
            });
            ProcessNotificationsRequest processNotificationsRequest = new ProcessNotificationsRequest();
            processNotificationsRequest.setRequests(this.requests);
            return processNotificationsRequest;
        }
    }

    /* access modifiers changed from: private */
    public void setRequests(List<ProcessNotificationRequest> list) {
        this.requests = list;
    }

    public List<ProcessNotificationRequest> getRequests() {
        return this.requests;
    }
}
