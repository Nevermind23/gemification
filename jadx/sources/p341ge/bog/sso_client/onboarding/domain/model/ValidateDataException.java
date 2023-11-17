package p341ge.bog.sso_client.onboarding.domain.model;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.sso_client.onboarding.domain.model.ValidateDataException */
public final class ValidateDataException extends Exception {

    /* renamed from: d */
    private final Integer f87048d;

    /* renamed from: e */
    private final String f87049e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ValidateDataException(Integer num, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, str, (i & 4) != 0 ? "" : str2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ValidateDataException(Integer num, String str, String str2) {
        super(str2);
        C41536l.m120489i(str2, "message");
        this.f87048d = num;
        this.f87049e = str;
    }
}
