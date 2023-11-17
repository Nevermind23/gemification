package p341ge.bog.mobilebank.cleanarch.moremenu.presentation;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p366bk.C10318g;

/* renamed from: ge.bog.mobilebank.cleanarch.moremenu.presentation.PackageType */
public enum PackageType {
    SOLO("SOLO", C10318g.f28620D0, 0, 4, (int) null),
    RB("RB", C10318g.f28644h1, C10318g.f28643f1),
    WM("WM", C10318g.color_primary_solid_df_500_wealth_light, 0, 4, (int) null),
    NO_ACTIVE_PACKAGE("noActivePackage", C10318g.f28629P0, C10318g.color_invert_component_tr_100);
    
    public static final Companion Companion = null;
    private final int badgeColor;
    private final int badgeTextColor;
    private final String packageBadge;

    /* renamed from: ge.bog.mobilebank.cleanarch.moremenu.presentation.PackageType$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PackageType getPackageTypeByBadge(String str) {
            for (PackageType packageType : PackageType.values()) {
                if (C41536l.m120484d(packageType.getPackageBadge(), str)) {
                    return packageType;
                }
            }
            return null;
        }
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    private PackageType(String str, int i, int i2) {
        this.packageBadge = str;
        this.badgeColor = i;
        this.badgeTextColor = i2;
    }

    public final int getBadgeColor() {
        return this.badgeColor;
    }

    public final int getBadgeTextColor() {
        return this.badgeTextColor;
    }

    public final String getPackageBadge() {
        return this.packageBadge;
    }
}
