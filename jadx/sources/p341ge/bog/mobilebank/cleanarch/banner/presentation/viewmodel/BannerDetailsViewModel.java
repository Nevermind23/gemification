package p341ge.bog.mobilebank.cleanarch.banner.presentation.viewmodel;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import hd1.C41204a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.banner.presentation.model.BannerDeepLinkData;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p748eu.C20292b;
import p754fq.C20544a;
import p768gq.C24774a;

/* renamed from: ge.bog.mobilebank.cleanarch.banner.presentation.viewmodel.BannerDetailsViewModel */
public final class BannerDetailsViewModel extends C21481a {

    /* renamed from: d */
    private final C20292b f56080d;

    /* renamed from: e */
    private final C24774a f56081e;

    /* renamed from: f */
    private final Gson f56082f;

    /* renamed from: g */
    private final C1644x f56083g = new C1644x();

    /* renamed from: h */
    private final C1644x f56084h = new C1644x();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BannerDetailsViewModel(C20292b bVar, C24774a aVar, Gson gson) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(bVar, "getAppSettingByNameUseCase");
        C41536l.m120489i(aVar, "bannerDataMapper");
        C41536l.m120489i(gson, "gson");
        this.f56080d = bVar;
        this.f56081e = aVar;
        this.f56082f = gson;
    }

    /* renamed from: dw */
    public final LiveData mo49568dw() {
        return this.f56084h;
    }

    /* renamed from: ew */
    public final LiveData mo49569ew() {
        return this.f56083g;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: ge.bog.mobilebank.cleanarch.banner.presentation.model.NboBanner} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: ge.bog.mobilebank.cleanarch.banner.presentation.model.NboBanner} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: ge.bog.mobilebank.cleanarch.banner.presentation.model.NboBanner} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: ge.bog.mobilebank.cleanarch.banner.presentation.model.NboBanner} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: fw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49570fw(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "bannerName"
            kotlin.jvm.internal.C41536l.m120489i(r7, r0)
            eu.b r0 = r6.f56080d
            java.lang.String r1 = "NBO_BANNER"
            fu.a r0 = r0.mo48775b(r1)
            r1 = 0
            if (r0 == 0) goto L_0x0015
            com.google.gson.h r0 = r0.mo49085b()
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            com.google.gson.Gson r2 = r6.f56082f
            java.lang.Class<ge.bog.mobilebank.cleanarch.banner.presentation.model.NboBanners> r3 = p341ge.bog.mobilebank.cleanarch.banner.presentation.model.NboBanners.class
            java.lang.Object r0 = r2.mo18165g(r0, r3)
            ge.bog.mobilebank.cleanarch.banner.presentation.model.NboBanners r0 = (p341ge.bog.mobilebank.cleanarch.banner.presentation.model.NboBanners) r0
            if (r0 == 0) goto L_0x0079
            java.util.List r0 = r0.getBannerList()
            if (r0 == 0) goto L_0x0079
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0031:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x004e
            java.lang.Object r3 = r0.next()
            r4 = r3
            ge.bog.mobilebank.cleanarch.banner.presentation.model.NboBanner r4 = (p341ge.bog.mobilebank.cleanarch.banner.presentation.model.NboBanner) r4
            java.lang.String r4 = r4.getBannerType()
            java.lang.String r5 = "MBANK_AUTHORIZED_HOME"
            boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r4 == 0) goto L_0x0031
            r2.add(r3)
            goto L_0x0031
        L_0x004e:
            java.util.Iterator r0 = r2.iterator()
        L_0x0052:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x006a
            java.lang.Object r2 = r0.next()
            r3 = r2
            ge.bog.mobilebank.cleanarch.banner.presentation.model.NboBanner r3 = (p341ge.bog.mobilebank.cleanarch.banner.presentation.model.NboBanner) r3
            java.lang.String r3 = r3.getBannerName()
            boolean r3 = kotlin.jvm.internal.C41536l.m120484d(r3, r7)
            if (r3 == 0) goto L_0x0052
            r1 = r2
        L_0x006a:
            ge.bog.mobilebank.cleanarch.banner.presentation.model.NboBanner r1 = (p341ge.bog.mobilebank.cleanarch.banner.presentation.model.NboBanner) r1
            if (r1 == 0) goto L_0x0079
            androidx.lifecycle.x r7 = r6.f56083g
            gq.a r0 = r6.f56081e
            fq.a r0 = r0.mo63177a(r1)
            p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c.m69418j(r7, r0)
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.banner.presentation.viewmodel.BannerDetailsViewModel.mo49570fw(java.lang.String):void");
    }

    /* renamed from: gw */
    public final void mo49571gw() {
        C20544a aVar;
        String d;
        C21503d dVar = (C21503d) this.f56083g.mo4814f();
        if (dVar != null && (aVar = (C20544a) dVar.mo53701a()) != null && (d = aVar.mo49069d()) != null) {
            try {
                C1644x xVar = this.f56084h;
                Object l = new Gson().mo18170l(d, BannerDeepLinkData.class);
                C41536l.m120488h(l, "Gson().fromJson(\n       …ava\n                    )");
                C21484c.m69418j(xVar, l);
            } catch (JsonSyntaxException unused) {
            }
        }
    }
}
