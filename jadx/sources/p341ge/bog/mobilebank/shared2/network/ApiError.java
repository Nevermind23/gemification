package p341ge.bog.mobilebank.shared2.network;

import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.shared2.network.ApiError */
public final class ApiError extends Exception {

    /* renamed from: d */
    private final BankApiResponse f83821d;

    public ApiError(BankApiResponse bankApiResponse) {
        C41536l.m120489i(bankApiResponse, "response");
        this.f83821d = bankApiResponse;
    }

    /* renamed from: a */
    public final BankApiResponse mo84685a() {
        return this.f83821d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ApiError) && C41536l.m120484d(this.f83821d, ((ApiError) obj).f83821d);
    }

    public int hashCode() {
        return this.f83821d.hashCode();
    }

    public String toString() {
        BankApiResponse bankApiResponse = this.f83821d;
        return "ApiError(response=" + bankApiResponse + ")";
    }
}
