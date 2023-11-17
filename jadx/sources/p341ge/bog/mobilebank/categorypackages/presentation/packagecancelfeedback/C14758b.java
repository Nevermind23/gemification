package p341ge.bog.mobilebank.categorypackages.presentation.packagecancelfeedback;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p202p0.C7593r;
import p341ge.bog.mobilebank.cleanarch.moremenu.presentation.PackageType;
import p356ao.C10114f;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagecancelfeedback.b */
public abstract class C14758b {

    /* renamed from: a */
    public static final C14759a f42792a = new C14759a((DefaultConstructorMarker) null);

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagecancelfeedback.b$a */
    public static final class C14759a {
        private C14759a() {
        }

        public /* synthetic */ C14759a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C7593r m54314b(C14759a aVar, PackageType packageType, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                packageType = PackageType.NO_ACTIVE_PACKAGE;
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return aVar.mo41194a(packageType, z);
        }

        /* renamed from: a */
        public final C7593r mo41194a(PackageType packageType, boolean z) {
            C41536l.m120489i(packageType, "packageType");
            return new C14760b(packageType, z);
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagecancelfeedback.b$b */
    private static final class C14760b implements C7593r {

        /* renamed from: a */
        private final PackageType f42793a;

        /* renamed from: b */
        private final boolean f42794b;

        /* renamed from: c */
        private final int f42795c = C10114f.returnToPackageDetails;

        public C14760b(PackageType packageType, boolean z) {
            C41536l.m120489i(packageType, "packageType");
            this.f42793a = packageType;
            this.f42794b = z;
        }

        /* renamed from: a */
        public int mo22014a() {
            return this.f42795c;
        }

        /* renamed from: b */
        public Bundle mo22015b() {
            Bundle bundle = new Bundle();
            Class<PackageType> cls = PackageType.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                PackageType packageType = this.f42793a;
                C41536l.m120487g(packageType, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("package_type", (Parcelable) packageType);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                PackageType packageType2 = this.f42793a;
                C41536l.m120487g(packageType2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("package_type", packageType2);
            }
            bundle.putBoolean("kyc_badge", this.f42794b);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C14760b)) {
                return false;
            }
            C14760b bVar = (C14760b) obj;
            return this.f42793a == bVar.f42793a && this.f42794b == bVar.f42794b;
        }

        public int hashCode() {
            int hashCode = this.f42793a.hashCode() * 31;
            boolean z = this.f42794b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            PackageType packageType = this.f42793a;
            boolean z = this.f42794b;
            return "ReturnToPackageDetails(packageType=" + packageType + ", kycBadge=" + z + ")";
        }
    }
}
