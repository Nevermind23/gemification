package n61;

import f61.C31931c;
import f61.C31932d;
import he1.C41224m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.presentation.home.model.StoryGroupThumbnail;
import r70.C27946a;

/* renamed from: n61.b */
public final class C37360b extends C27946a {
    /* renamed from: b */
    private final boolean m110112b(C31932d dVar) {
        List<C31931c> c = dVar.mo72403c();
        if ((c instanceof Collection) && c.isEmpty()) {
            return true;
        }
        for (C31931c q : c) {
            if (!q.mo72399q()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v14, types: [ge.bog.designsystem.components.common.Image] */
    /* JADX WARNING: type inference failed for: r1v25, types: [ge.bog.designsystem.components.common.Image] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00eb  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p341ge.bog.mobilebank.cleanarch.presentation.home.model.StoryGroupThumbnail m110113c(f61.C31932d r16) {
        /*
            r15 = this;
            f61.e r0 = r16.mo72404d()
            long r2 = r0.mo72412e()
            g91.e0 r0 = g91.C32300e0.f79712a
            boolean r1 = r0.mo72821k()
            r4 = 0
            if (r1 == 0) goto L_0x003d
            f61.e r1 = r16.mo72404d()
            f61.f r1 = r1.mo72416h()
            f61.f$b r5 = f61.C31934f.C31936b.f78718c
            boolean r1 = kotlin.jvm.internal.C41536l.m120484d(r1, r5)
            if (r1 != 0) goto L_0x003d
            f61.e r1 = r16.mo72404d()
            java.lang.String r6 = r1.mo72411d()
            if (r6 == 0) goto L_0x003b
            ge.bog.designsystem.components.common.Image$Url r1 = new ge.bog.designsystem.components.common.Image$Url
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 126(0x7e, float:1.77E-43)
            r14 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0061
        L_0x003b:
            r1 = r4
            goto L_0x0061
        L_0x003d:
            boolean r1 = r0.mo72821k()
            if (r1 == 0) goto L_0x0065
            f61.e r1 = r16.mo72404d()
            f61.f r1 = r1.mo72416h()
            f61.f$b r5 = f61.C31934f.C31936b.f78718c
            boolean r1 = kotlin.jvm.internal.C41536l.m120484d(r1, r5)
            if (r1 == 0) goto L_0x0065
            f61.e r1 = r16.mo72404d()
            java.lang.String r1 = r1.mo72411d()
            if (r1 == 0) goto L_0x0063
            ge.bog.designsystem.components.common.Image r1 = g91.C32298d0.m95162a(r1)
        L_0x0061:
            r5 = r1
            goto L_0x00cb
        L_0x0063:
            r5 = r4
            goto L_0x00cb
        L_0x0065:
            boolean r1 = r0.mo72821k()
            if (r1 != 0) goto L_0x0095
            f61.e r1 = r16.mo72404d()
            f61.f r1 = r1.mo72416h()
            f61.f$b r5 = f61.C31934f.C31936b.f78718c
            boolean r1 = kotlin.jvm.internal.C41536l.m120484d(r1, r5)
            if (r1 != 0) goto L_0x0095
            f61.e r1 = r16.mo72404d()
            java.lang.String r6 = r1.mo72414f()
            if (r6 == 0) goto L_0x003b
            ge.bog.designsystem.components.common.Image$Url r1 = new ge.bog.designsystem.components.common.Image$Url
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 126(0x7e, float:1.77E-43)
            r14 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0061
        L_0x0095:
            boolean r1 = r0.mo72821k()
            if (r1 != 0) goto L_0x00ba
            f61.e r1 = r16.mo72404d()
            f61.f r1 = r1.mo72416h()
            f61.f$b r5 = f61.C31934f.C31936b.f78718c
            boolean r1 = kotlin.jvm.internal.C41536l.m120484d(r1, r5)
            if (r1 == 0) goto L_0x00ba
            f61.e r1 = r16.mo72404d()
            java.lang.String r1 = r1.mo72414f()
            if (r1 == 0) goto L_0x0063
            ge.bog.designsystem.components.common.Image r1 = g91.C32298d0.m95162a(r1)
            goto L_0x0061
        L_0x00ba:
            ge.bog.designsystem.components.common.Image$Url r1 = new ge.bog.designsystem.components.common.Image$Url
            java.lang.String r6 = ""
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 126(0x7e, float:1.77E-43)
            r14 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x00cb:
            boolean r0 = r0.mo72821k()
            if (r0 == 0) goto L_0x00da
            f61.e r0 = r16.mo72404d()
            java.lang.String r0 = r0.mo72409b()
            goto L_0x00e2
        L_0x00da:
            f61.e r0 = r16.mo72404d()
            java.lang.String r0 = r0.mo72408a()
        L_0x00e2:
            if (r0 == 0) goto L_0x00eb
            ge.bog.mobilebank.shared.helper.StringSource$Raw r1 = new ge.bog.mobilebank.shared.helper.StringSource$Raw
            r1.<init>(r0)
            r0 = r1
            goto L_0x00ec
        L_0x00eb:
            r0 = r4
        L_0x00ec:
            boolean r6 = r15.m110112b(r16)
            f61.e r1 = r16.mo72404d()
            java.lang.String r7 = r1.mo72410c()
            ge.bog.mobilebank.cleanarch.presentation.home.model.StoryGroupThumbnail r8 = new ge.bog.mobilebank.cleanarch.presentation.home.model.StoryGroupThumbnail
            r1 = r8
            r4 = r5
            r5 = r0
            r1.<init>(r2, r4, r5, r6, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n61.C37360b.m110113c(f61.d):ge.bog.mobilebank.cleanarch.presentation.home.model.StoryGroupThumbnail");
    }

    /* renamed from: a */
    public List mo67514a(List list) {
        C41536l.m120489i(list, "stories");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m110113c((C31932d) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object next : arrayList) {
            if (((StoryGroupThumbnail) next).mo54193f()) {
                arrayList2.add(next);
            } else {
                arrayList3.add(next);
            }
        }
        C41224m mVar = new C41224m(arrayList2, arrayList3);
        return C41358y.m120023m0((List) mVar.mo95676b(), (List) mVar.mo95675a());
    }
}
