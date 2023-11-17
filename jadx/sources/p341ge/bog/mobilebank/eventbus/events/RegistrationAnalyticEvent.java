package p341ge.bog.mobilebank.eventbus.events;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.eventbus.RootEvent;

/* renamed from: ge.bog.mobilebank.eventbus.events.RegistrationAnalyticEvent */
public final class RegistrationAnalyticEvent extends RootEvent {
    private final String pathSelected;
    private final String pathServer;

    public RegistrationAnalyticEvent() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public final String getPathSelected() {
        return this.pathSelected;
    }

    public final String getPathServer() {
        return this.pathServer;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RegistrationAnalyticEvent(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public RegistrationAnalyticEvent(String str, String str2) {
        this.pathServer = str;
        this.pathSelected = str2;
    }
}
