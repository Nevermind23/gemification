package com.salesforce.marketingcloud.internal;

import com.salesforce.marketingcloud.location.LatLon;
import com.salesforce.marketingcloud.messages.Region;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.salesforce.marketingcloud.internal.j */
public final class C11509j {

    /* renamed from: a */
    public static final C11510a f33426a = new C11510a((DefaultConstructorMarker) null);

    /* renamed from: com.salesforce.marketingcloud.internal.j$a */
    public static final class C11510a {
        private C11510a() {
        }

        public /* synthetic */ C11510a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Region mo30081a(LatLon latLon, int i) {
            C41536l.m120489i(latLon, "center");
            return Region.Companion.m124907magicFence(latLon, i);
        }

        /* renamed from: a */
        public final void mo30082a(Region region, boolean z) {
            C41536l.m120489i(region, "region");
            region.m124904isInside(z);
        }

        /* renamed from: a */
        public final boolean mo30083a(Region region) {
            C41536l.m120489i(region, "region");
            return region.m124905isInside();
        }
    }

    /* renamed from: a */
    public static final Region m42063a(LatLon latLon, int i) {
        return f33426a.mo30081a(latLon, i);
    }

    /* renamed from: a */
    public static final void m42064a(Region region, boolean z) {
        f33426a.mo30082a(region, z);
    }

    /* renamed from: a */
    public static final boolean m42065a(Region region) {
        return f33426a.mo30083a(region);
    }
}
