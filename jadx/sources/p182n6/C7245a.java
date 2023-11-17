package p182n6;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;

/* renamed from: n6.a */
public abstract class C7245a {
    /* renamed from: a */
    public static ApiException m27851a(Status status) {
        if (status.mo11901f0()) {
            return new ResolvableApiException(status);
        }
        return new ApiException(status);
    }
}
