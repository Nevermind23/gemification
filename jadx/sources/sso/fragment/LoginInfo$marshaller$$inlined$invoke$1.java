package sso.fragment;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;

public final class LoginInfo$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ LoginInfo this$0;

    public LoginInfo$marshaller$$inlined$invoke$1(LoginInfo loginInfo) {
        this.this$0 = loginInfo;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(LoginInfo.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23320e(LoginInfo.RESPONSE_FIELDS[1], this.this$0.isChannelActive());
        pVar.mo23320e(LoginInfo.RESPONSE_FIELDS[2], this.this$0.isPasswordExpired());
        pVar.mo23320e(LoginInfo.RESPONSE_FIELDS[3], this.this$0.isUsernameChangeRequired());
        pVar.mo23320e(LoginInfo.RESPONSE_FIELDS[4], this.this$0.getPasswordChangeRequired());
        pVar.mo23319d(LoginInfo.RESPONSE_FIELDS[5], this.this$0.getProcessReference());
    }
}
