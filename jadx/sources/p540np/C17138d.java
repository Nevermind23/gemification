package p540np;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p202p0.C7540f;
import p341ge.bog.mobilebank.cleanarch.moremenu.presentation.PackageType;

/* renamed from: np.d */
public final class C17138d implements C7540f {

    /* renamed from: b */
    public static final C17139a f47960b = new C17139a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final PackageType f47961a;

    /* renamed from: np.d$a */
    public static final class C17139a {
        private C17139a() {
        }

        public /* synthetic */ C17139a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C17138d mo44563a(Bundle bundle) {
            PackageType packageType;
            C41536l.m120489i(bundle, "bundle");
            bundle.setClassLoader(C17138d.class.getClassLoader());
            if (bundle.containsKey("package_type")) {
                Class<PackageType> cls = PackageType.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    packageType = (PackageType) bundle.get("package_type");
                    if (packageType == null) {
                        throw new IllegalArgumentException("Argument \"package_type\" is marked as non-null but was passed a null value.");
                    }
                } else {
                    String name = cls.getName();
                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                }
            } else {
                packageType = PackageType.NO_ACTIVE_PACKAGE;
            }
            return new C17138d(packageType);
        }
    }

    public C17138d(PackageType packageType) {
        C41536l.m120489i(packageType, "packageType");
        this.f47961a = packageType;
    }

    public static final C17138d fromBundle(Bundle bundle) {
        return f47960b.mo44563a(bundle);
    }

    /* renamed from: a */
    public final PackageType mo44559a() {
        return this.f47961a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17138d) && this.f47961a == ((C17138d) obj).f47961a;
    }

    public int hashCode() {
        return this.f47961a.hashCode();
    }

    public String toString() {
        PackageType packageType = this.f47961a;
        return "PackageCancelFeedbackFragmentArgs(packageType=" + packageType + ")";
    }
}
