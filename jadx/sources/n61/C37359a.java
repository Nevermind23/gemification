package n61;

import f61.C31928b;
import f61.C31931c;
import f61.C31932d;
import he1.C41224m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.stories.presentation.model.StoryContentLinkUiModel;
import p341ge.bog.mobilebank.stories.presentation.model.StoryDetailsUiModel;
import p341ge.bog.mobilebank.stories.presentation.model.StoryGroupUiModel;
import w31.C39514b;

/* renamed from: n61.a */
public final class C37359a {

    /* renamed from: a */
    private final C39514b f89842a;

    public C37359a(C39514b bVar) {
        C41536l.m120489i(bVar, "urlDataMapper");
        this.f89842a = bVar;
    }

    /* renamed from: a */
    private final StoryContentLinkUiModel m110107a(C31928b bVar) {
        if (bVar instanceof C31928b.C31929a) {
            return new StoryContentLinkUiModel.DeepLink(this.f89842a.mo93148a(((C31928b.C31929a) bVar).mo72374a()));
        }
        if (bVar instanceof C31928b.C31930b) {
            return new StoryContentLinkUiModel.Url(((C31928b.C31930b) bVar).mo72378a());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: e */
    public static /* synthetic */ List m110108e(C37359a aVar, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return aVar.mo90440d(list, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ce  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p341ge.bog.mobilebank.stories.presentation.model.StoryDetailsUiModel mo90438b(f61.C31931c r20, java.lang.Integer r21) {
        /*
            r19 = this;
            java.lang.String r0 = "storyDetails"
            r1 = r20
            kotlin.jvm.internal.C41536l.m120489i(r1, r0)
            long r2 = r20.mo72397o()
            g91.e0 r0 = g91.C32300e0.f79712a
            java.lang.String r4 = r20.mo72392j()
            java.lang.String r5 = r20.mo72391i()
            java.lang.Object r4 = r0.mo72820j(r4, r5)
            java.lang.String r4 = (java.lang.String) r4
            r5 = 0
            if (r4 == 0) goto L_0x0023
            ge.bog.mobilebank.shared.helper.StringSource$Raw r4 = p341ge.bog.mobilebank.shared.helper.C34646b.m101749c(r4)
            goto L_0x0024
        L_0x0023:
            r4 = r5
        L_0x0024:
            java.lang.String r6 = r20.mo72387f()
            java.lang.String r7 = r20.mo72385e()
            java.lang.Object r6 = r0.mo72820j(r6, r7)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x0039
            ge.bog.mobilebank.shared.helper.StringSource$Raw r6 = p341ge.bog.mobilebank.shared.helper.C34646b.m101749c(r6)
            goto L_0x003a
        L_0x0039:
            r6 = r5
        L_0x003a:
            java.lang.String r7 = r20.mo72384d()
            java.lang.String r8 = r20.mo72383c()
            java.lang.Object r7 = r0.mo72820j(r7, r8)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x004f
            ge.bog.mobilebank.shared.helper.StringSource$Raw r7 = p341ge.bog.mobilebank.shared.helper.C34646b.m101749c(r7)
            goto L_0x0050
        L_0x004f:
            r7 = r5
        L_0x0050:
            f61.f r8 = r20.mo72400r()
            f61.f$b r9 = f61.C31934f.C31936b.f78718c
            boolean r8 = kotlin.jvm.internal.C41536l.m120484d(r8, r9)
            if (r8 == 0) goto L_0x0084
            java.lang.String r8 = r20.mo72396n()
            java.lang.String r9 = r20.mo72398p()
            java.lang.Object r8 = r0.mo72820j(r8, r9)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x00a7
            java.lang.String r10 = g91.C32289b0.m95091c(r8)
            if (r10 == 0) goto L_0x00a7
            ge.bog.designsystem.components.common.Image$Url r8 = new ge.bog.designsystem.components.common.Image$Url
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 126(0x7e, float:1.77E-43)
            r18 = 0
            r9 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x00a8
        L_0x0084:
            java.lang.String r8 = r20.mo72396n()
            java.lang.String r9 = r20.mo72398p()
            java.lang.Object r8 = r0.mo72820j(r8, r9)
            r10 = r8
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L_0x00a7
            ge.bog.designsystem.components.common.Image$Url r8 = new ge.bog.designsystem.components.common.Image$Url
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 126(0x7e, float:1.77E-43)
            r18 = 0
            r9 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x00a8
        L_0x00a7:
            r8 = r5
        L_0x00a8:
            f61.b r9 = r20.mo72389h()
            f61.b r10 = r20.mo72388g()
            java.lang.Object r0 = r0.mo72820j(r9, r10)
            f61.b r0 = (f61.C31928b) r0
            r14 = r19
            if (r0 == 0) goto L_0x00bf
            ge.bog.mobilebank.stories.presentation.model.StoryContentLinkUiModel r0 = r14.m110107a(r0)
            goto L_0x00c0
        L_0x00bf:
            r0 = r5
        L_0x00c0:
            java.lang.String r9 = r20.mo72394l()
            java.lang.String r10 = r20.mo72393k()
            java.lang.String r11 = r20.mo72395m()
            if (r21 == 0) goto L_0x00da
            int r5 = r21.intValue()
            long r12 = (long) r5
            r15 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 * r15
            java.lang.Long r5 = java.lang.Long.valueOf(r12)
        L_0x00da:
            r12 = r5
            boolean r13 = r20.mo72399q()
            ge.bog.mobilebank.stories.presentation.model.StoryDetailsUiModel r15 = new ge.bog.mobilebank.stories.presentation.model.StoryDetailsUiModel
            r1 = r15
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r0
            r1.<init>(r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: n61.C37359a.mo90438b(f61.c, java.lang.Integer):ge.bog.mobilebank.stories.presentation.model.StoryDetailsUiModel");
    }

    /* renamed from: c */
    public final StoryGroupUiModel mo90439c(C31932d dVar) {
        C41536l.m120489i(dVar, "storyGroup");
        List<C31931c> c = dVar.mo72403c();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(c, 10));
        for (C31931c b : c) {
            arrayList.add(mo90438b(b, Integer.valueOf(dVar.mo72404d().mo72415g())));
        }
        return new StoryGroupUiModel(arrayList, dVar.mo72404d().mo72412e());
    }

    /* renamed from: d */
    public final List mo90440d(List list, boolean z) {
        C41536l.m120489i(list, "stories");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo90439c((C31932d) it.next()));
        }
        if (!z) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object next : arrayList) {
            List b = ((StoryGroupUiModel) next).mo85098b();
            boolean z2 = true;
            if (!(b instanceof Collection) || !b.isEmpty()) {
                Iterator it2 = b.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!((StoryDetailsUiModel) it2.next()).mo85090l()) {
                            z2 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z2) {
                arrayList2.add(next);
            } else {
                arrayList3.add(next);
            }
        }
        C41224m mVar = new C41224m(arrayList2, arrayList3);
        return C41358y.m120023m0((List) mVar.mo95676b(), (List) mVar.mo95675a());
    }
}
