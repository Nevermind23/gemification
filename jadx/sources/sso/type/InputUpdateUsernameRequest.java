package sso.type;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p217q2.C7833e;
import p217q2.C7835f;
import p243s2.C8106f;

public final class InputUpdateUsernameRequest implements C7835f {
    private final C7833e processReference;
    private final C7833e tmxSessionId;
    private final C7833e username;

    public InputUpdateUsernameRequest() {
        this((C7833e) null, (C7833e) null, (C7833e) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ InputUpdateUsernameRequest copy$default(InputUpdateUsernameRequest inputUpdateUsernameRequest, C7833e eVar, C7833e eVar2, C7833e eVar3, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = inputUpdateUsernameRequest.processReference;
        }
        if ((i & 2) != 0) {
            eVar2 = inputUpdateUsernameRequest.tmxSessionId;
        }
        if ((i & 4) != 0) {
            eVar3 = inputUpdateUsernameRequest.username;
        }
        return inputUpdateUsernameRequest.copy(eVar, eVar2, eVar3);
    }

    public final C7833e component1() {
        return this.processReference;
    }

    public final C7833e component2() {
        return this.tmxSessionId;
    }

    public final C7833e component3() {
        return this.username;
    }

    public final InputUpdateUsernameRequest copy(C7833e eVar, C7833e eVar2, C7833e eVar3) {
        C41536l.m120489i(eVar, "processReference");
        C41536l.m120489i(eVar2, "tmxSessionId");
        C41536l.m120489i(eVar3, "username");
        return new InputUpdateUsernameRequest(eVar, eVar2, eVar3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputUpdateUsernameRequest)) {
            return false;
        }
        InputUpdateUsernameRequest inputUpdateUsernameRequest = (InputUpdateUsernameRequest) obj;
        return C41536l.m120484d(this.processReference, inputUpdateUsernameRequest.processReference) && C41536l.m120484d(this.tmxSessionId, inputUpdateUsernameRequest.tmxSessionId) && C41536l.m120484d(this.username, inputUpdateUsernameRequest.username);
    }

    public final C7833e getProcessReference() {
        return this.processReference;
    }

    public final C7833e getTmxSessionId() {
        return this.tmxSessionId;
    }

    public final C7833e getUsername() {
        return this.username;
    }

    public int hashCode() {
        return (((this.processReference.hashCode() * 31) + this.tmxSessionId.hashCode()) * 31) + this.username.hashCode();
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new InputUpdateUsernameRequest$marshaller$$inlined$invoke$1(this);
    }

    public String toString() {
        return "InputUpdateUsernameRequest(processReference=" + this.processReference + ", tmxSessionId=" + this.tmxSessionId + ", username=" + this.username + ')';
    }

    public InputUpdateUsernameRequest(C7833e eVar, C7833e eVar2, C7833e eVar3) {
        C41536l.m120489i(eVar, "processReference");
        C41536l.m120489i(eVar2, "tmxSessionId");
        C41536l.m120489i(eVar3, "username");
        this.processReference = eVar;
        this.tmxSessionId = eVar2;
        this.username = eVar3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InputUpdateUsernameRequest(C7833e eVar, C7833e eVar2, C7833e eVar3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C7833e.f22754c.mo22767a() : eVar, (i & 2) != 0 ? C7833e.f22754c.mo22767a() : eVar2, (i & 4) != 0 ? C7833e.f22754c.mo22767a() : eVar3);
    }
}
