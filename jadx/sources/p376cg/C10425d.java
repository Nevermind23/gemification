package p376cg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p341ge.bog.chat.presentation.view.MessageInputLayout;
import p341ge.bog.chatkit.messages.MessagesList;
import p653wf.C18589r;

/* renamed from: cg.d */
public final class C10425d implements C6201a {

    /* renamed from: d */
    private final LinearLayout f29641d;

    /* renamed from: e */
    public final MessageInputLayout f29642e;

    /* renamed from: f */
    public final MessagesList f29643f;

    /* renamed from: g */
    public final C10430i f29644g;

    /* renamed from: h */
    public final C10434m f29645h;

    private C10425d(LinearLayout linearLayout, MessageInputLayout messageInputLayout, MessagesList messagesList, C10430i iVar, C10434m mVar) {
        this.f29641d = linearLayout;
        this.f29642e = messageInputLayout;
        this.f29643f = messagesList;
        this.f29644g = iVar;
        this.f29645h = mVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = p653wf.C18588q.noHistory;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p376cg.C10425d m37866a(android.view.View r8) {
        /*
            int r0 = p653wf.C18588q.f52155O
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r4 = r1
            ge.bog.chat.presentation.view.MessageInputLayout r4 = (p341ge.bog.chat.presentation.view.MessageInputLayout) r4
            if (r4 == 0) goto L_0x0038
            int r0 = p653wf.C18588q.messagesList
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r5 = r1
            ge.bog.chatkit.messages.MessagesList r5 = (p341ge.bog.chatkit.messages.MessagesList) r5
            if (r5 == 0) goto L_0x0038
            int r0 = p653wf.C18588q.noHistory
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            if (r1 == 0) goto L_0x0038
            cg.i r6 = p376cg.C10430i.m37885a(r1)
            int r0 = p653wf.C18588q.f52149B0
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            if (r1 == 0) goto L_0x0038
            cg.m r7 = p376cg.C10434m.m37900a(r1)
            cg.d r0 = new cg.d
            r3 = r8
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        L_0x0038:
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r8 = r8.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r8 = r1.concat(r8)
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p376cg.C10425d.m37866a(android.view.View):cg.d");
    }

    /* renamed from: d */
    public static C10425d m37867d(LayoutInflater layoutInflater) {
        return m37868e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C10425d m37868e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C18589r.activity_conversation, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m37866a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f29641d;
    }
}
