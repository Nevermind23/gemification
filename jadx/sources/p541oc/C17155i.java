package p541oc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Chronometer;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.identomat.subfragments.views.DocumentView;
import com.identomat.subfragments.views.HoldDocumentView;
import org.webrtc.SurfaceViewRenderer;
import p086g1.C6201a;
import p485kc.C16348f;

/* renamed from: oc.i */
public final class C17155i implements C6201a {

    /* renamed from: A */
    public final ImageButton f48035A;

    /* renamed from: B */
    public final TextView f48036B;

    /* renamed from: C */
    public final LinearLayout f48037C;

    /* renamed from: d */
    private final RelativeLayout f48038d;

    /* renamed from: e */
    public final RelativeLayout f48039e;

    /* renamed from: f */
    public final Chronometer f48040f;

    /* renamed from: g */
    public final RelativeLayout f48041g;

    /* renamed from: h */
    public final RelativeLayout f48042h;

    /* renamed from: i */
    public final TextView f48043i;

    /* renamed from: j */
    public final RelativeLayout f48044j;

    /* renamed from: k */
    public final HoldDocumentView f48045k;

    /* renamed from: l */
    public final DocumentView f48046l;

    /* renamed from: m */
    public final RelativeLayout f48047m;

    /* renamed from: n */
    public final ImageButton f48048n;

    /* renamed from: o */
    public final ImageView f48049o;

    /* renamed from: p */
    public final RelativeLayout f48050p;

    /* renamed from: q */
    public final TextView f48051q;

    /* renamed from: r */
    public final SurfaceViewRenderer f48052r;

    /* renamed from: s */
    public final ImageButton f48053s;

    /* renamed from: t */
    public final LinearLayout f48054t;

    /* renamed from: u */
    public final View f48055u;

    /* renamed from: v */
    public final RelativeLayout f48056v;

    /* renamed from: w */
    public final TextView f48057w;

    /* renamed from: x */
    public final RelativeLayout f48058x;

    /* renamed from: y */
    public final TextView f48059y;

    /* renamed from: z */
    public final ImageButton f48060z;

    private C17155i(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, Chronometer chronometer, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, TextView textView, RelativeLayout relativeLayout5, HoldDocumentView holdDocumentView, DocumentView documentView, RelativeLayout relativeLayout6, ImageButton imageButton, ImageView imageView, RelativeLayout relativeLayout7, TextView textView2, SurfaceViewRenderer surfaceViewRenderer, ImageButton imageButton2, LinearLayout linearLayout, View view, RelativeLayout relativeLayout8, TextView textView3, RelativeLayout relativeLayout9, TextView textView4, ImageButton imageButton3, ImageButton imageButton4, TextView textView5, LinearLayout linearLayout2) {
        this.f48038d = relativeLayout;
        this.f48039e = relativeLayout2;
        this.f48040f = chronometer;
        this.f48041g = relativeLayout3;
        this.f48042h = relativeLayout4;
        this.f48043i = textView;
        this.f48044j = relativeLayout5;
        this.f48045k = holdDocumentView;
        this.f48046l = documentView;
        this.f48047m = relativeLayout6;
        this.f48048n = imageButton;
        this.f48049o = imageView;
        this.f48050p = relativeLayout7;
        this.f48051q = textView2;
        this.f48052r = surfaceViewRenderer;
        this.f48053s = imageButton2;
        this.f48054t = linearLayout;
        this.f48055u = view;
        this.f48056v = relativeLayout8;
        this.f48057w = textView3;
        this.f48058x = relativeLayout9;
        this.f48059y = textView4;
        this.f48060z = imageButton3;
        this.f48035A = imageButton4;
        this.f48036B = textView5;
        this.f48037C = linearLayout2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b7, code lost:
        r1 = p485kc.C16347e.operator_busy_try_later;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p541oc.C17155i m60263a(android.view.View r30) {
        /*
            r0 = r30
            int r1 = p485kc.C16347e.accept_cancel_call
            android.view.View r2 = r0.findViewById(r1)
            r5 = r2
            android.widget.RelativeLayout r5 = (android.widget.RelativeLayout) r5
            if (r5 == 0) goto L_0x0129
            int r1 = p485kc.C16347e.call_duration
            android.view.View r2 = r0.findViewById(r1)
            r6 = r2
            android.widget.Chronometer r6 = (android.widget.Chronometer) r6
            if (r6 == 0) goto L_0x0129
            int r1 = p485kc.C16347e.cancel_call_modal
            android.view.View r2 = r0.findViewById(r1)
            r7 = r2
            android.widget.RelativeLayout r7 = (android.widget.RelativeLayout) r7
            if (r7 == 0) goto L_0x0129
            int r1 = p485kc.C16347e.cancel_cancel_call
            android.view.View r2 = r0.findViewById(r1)
            r8 = r2
            android.widget.RelativeLayout r8 = (android.widget.RelativeLayout) r8
            if (r8 == 0) goto L_0x0129
            int r1 = p485kc.C16347e.connecting_status
            android.view.View r2 = r0.findViewById(r1)
            r9 = r2
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L_0x0129
            int r1 = p485kc.C16347e.dark_view
            android.view.View r2 = r0.findViewById(r1)
            r10 = r2
            android.widget.RelativeLayout r10 = (android.widget.RelativeLayout) r10
            if (r10 == 0) goto L_0x0129
            int r1 = p485kc.C16347e.document_hold_view
            android.view.View r2 = r0.findViewById(r1)
            r11 = r2
            com.identomat.subfragments.views.HoldDocumentView r11 = (com.identomat.subfragments.views.HoldDocumentView) r11
            if (r11 == 0) goto L_0x0129
            int r1 = p485kc.C16347e.document_view
            android.view.View r2 = r0.findViewById(r1)
            r12 = r2
            com.identomat.subfragments.views.DocumentView r12 = (com.identomat.subfragments.views.DocumentView) r12
            if (r12 == 0) goto L_0x0129
            int r1 = p485kc.C16347e.document_view_holder
            android.view.View r2 = r0.findViewById(r1)
            r13 = r2
            android.widget.RelativeLayout r13 = (android.widget.RelativeLayout) r13
            if (r13 == 0) goto L_0x0129
            int r1 = p485kc.C16347e.end_call_view
            android.view.View r2 = r0.findViewById(r1)
            r14 = r2
            android.widget.ImageButton r14 = (android.widget.ImageButton) r14
            if (r14 == 0) goto L_0x0129
            int r1 = p485kc.C16347e.indicator_icon
            android.view.View r2 = r0.findViewById(r1)
            r15 = r2
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            if (r15 == 0) goto L_0x0129
            int r1 = p485kc.C16347e.indicator_view
            android.view.View r2 = r0.findViewById(r1)
            r16 = r2
            android.widget.RelativeLayout r16 = (android.widget.RelativeLayout) r16
            if (r16 == 0) goto L_0x0129
            int r1 = p485kc.C16347e.line_number
            android.view.View r2 = r0.findViewById(r1)
            r17 = r2
            android.widget.TextView r17 = (android.widget.TextView) r17
            if (r17 == 0) goto L_0x0129
            int r1 = p485kc.C16347e.local_renderer
            android.view.View r2 = r0.findViewById(r1)
            r18 = r2
            org.webrtc.SurfaceViewRenderer r18 = (org.webrtc.SurfaceViewRenderer) r18
            if (r18 == 0) goto L_0x0129
            int r1 = p485kc.C16347e.mute_call
            android.view.View r2 = r0.findViewById(r1)
            r19 = r2
            android.widget.ImageButton r19 = (android.widget.ImageButton) r19
            if (r19 == 0) goto L_0x0129
            int r1 = p485kc.C16347e.operator_badge
            android.view.View r2 = r0.findViewById(r1)
            r20 = r2
            android.widget.LinearLayout r20 = (android.widget.LinearLayout) r20
            if (r20 == 0) goto L_0x0129
            int r1 = p485kc.C16347e.operator_busy_try_later
            android.view.View r21 = r0.findViewById(r1)
            if (r21 == 0) goto L_0x0129
            int r1 = p485kc.C16347e.operatot_busy_modal
            android.view.View r2 = r0.findViewById(r1)
            r22 = r2
            android.widget.RelativeLayout r22 = (android.widget.RelativeLayout) r22
            if (r22 == 0) goto L_0x0129
            int r1 = p485kc.C16347e.progress_text_view
            android.view.View r2 = r0.findViewById(r1)
            r23 = r2
            android.widget.TextView r23 = (android.widget.TextView) r23
            if (r23 == 0) goto L_0x0129
            int r1 = p485kc.C16347e.queue_info_group
            android.view.View r2 = r0.findViewById(r1)
            r24 = r2
            android.widget.RelativeLayout r24 = (android.widget.RelativeLayout) r24
            if (r24 == 0) goto L_0x0129
            int r1 = p485kc.C16347e.queue_length
            android.view.View r2 = r0.findViewById(r1)
            r25 = r2
            android.widget.TextView r25 = (android.widget.TextView) r25
            if (r25 == 0) goto L_0x0129
            int r1 = p485kc.C16347e.swap_camera_view
            android.view.View r2 = r0.findViewById(r1)
            r26 = r2
            android.widget.ImageButton r26 = (android.widget.ImageButton) r26
            if (r26 == 0) goto L_0x0129
            int r1 = p485kc.C16347e.switch_camera_view
            android.view.View r2 = r0.findViewById(r1)
            r27 = r2
            android.widget.ImageButton r27 = (android.widget.ImageButton) r27
            if (r27 == 0) goto L_0x0129
            int r1 = p485kc.C16347e.title_view
            android.view.View r2 = r0.findViewById(r1)
            r28 = r2
            android.widget.TextView r28 = (android.widget.TextView) r28
            if (r28 == 0) goto L_0x0129
            int r1 = p485kc.C16347e.video_call_controls
            android.view.View r2 = r0.findViewById(r1)
            r29 = r2
            android.widget.LinearLayout r29 = (android.widget.LinearLayout) r29
            if (r29 == 0) goto L_0x0129
            oc.i r1 = new oc.i
            r3 = r1
            r4 = r0
            android.widget.RelativeLayout r4 = (android.widget.RelativeLayout) r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r1
        L_0x0129:
            android.content.res.Resources r0 = r30.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p541oc.C17155i.m60263a(android.view.View):oc.i");
    }

    /* renamed from: d */
    public static C17155i m60264d(LayoutInflater layoutInflater) {
        return m60265e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C17155i m60265e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C16348f.fragment_flow_identomat, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m60263a(inflate);
    }

    /* renamed from: c */
    public RelativeLayout mo3946b() {
        return this.f48038d;
    }
}
