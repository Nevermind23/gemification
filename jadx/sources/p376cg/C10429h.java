package p376cg;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewpager2.widget.ViewPager2;
import p086g1.C6201a;
import p341ge.bog.chat.presentation.view.TypingAnimationView;
import p341ge.bog.designsystem.components.accountpicker.AccountPickerView;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p341ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.designsystem.components.smallsteps.SmallStepsView;
import p341ge.bog.designsystem.components.textbadge.TextBadgeView;

/* renamed from: cg.h */
public final class C10429h implements C6201a {

    /* renamed from: A */
    public final LayerView f29661A;

    /* renamed from: B */
    public final TextBadgeView f29662B;

    /* renamed from: C */
    public final AppCompatImageView f29663C;

    /* renamed from: D */
    public final LinearLayout f29664D;

    /* renamed from: E */
    public final TwoLineTextItem f29665E;

    /* renamed from: F */
    public final LinearLayout f29666F;

    /* renamed from: G */
    public final FrameLayout f29667G;

    /* renamed from: H */
    public final ViewPager2 f29668H;

    /* renamed from: I */
    public final Input f29669I;

    /* renamed from: J */
    public final TypingAnimationView f29670J;

    /* renamed from: d */
    private final ConstraintLayout f29671d;

    /* renamed from: e */
    public final AccountPickerView f29672e;

    /* renamed from: f */
    public final FrameLayout f29673f;

    /* renamed from: g */
    public final FrameLayout f29674g;

    /* renamed from: h */
    public final LinearLayout f29675h;

    /* renamed from: i */
    public final ChipGroup f29676i;

    /* renamed from: j */
    public final LayerView f29677j;

    /* renamed from: k */
    public final View f29678k;

    /* renamed from: l */
    public final Input f29679l;

    /* renamed from: m */
    public final LayerView f29680m;

    /* renamed from: n */
    public final AppCompatTextView f29681n;

    /* renamed from: o */
    public final InlineFeedback2 f29682o;

    /* renamed from: p */
    public final LinearLayout f29683p;

    /* renamed from: q */
    public final C10427f f29684q;

    /* renamed from: r */
    public final C10428g f29685r;

    /* renamed from: s */
    public final LayerView f29686s;

    /* renamed from: t */
    public final Group f29687t;

    /* renamed from: u */
    public final LayerView f29688u;

    /* renamed from: v */
    public final AppCompatTextView f29689v;

    /* renamed from: w */
    public final AppCompatTextView f29690w;

    /* renamed from: x */
    public final ImageView f29691x;

    /* renamed from: y */
    public final AppCompatTextView f29692y;

    /* renamed from: z */
    public final SmallStepsView f29693z;

    private C10429h(ConstraintLayout constraintLayout, AccountPickerView accountPickerView, FrameLayout frameLayout, FrameLayout frameLayout2, LinearLayout linearLayout, ChipGroup chipGroup, LayerView layerView, View view, Input input, LayerView layerView2, AppCompatTextView appCompatTextView, InlineFeedback2 inlineFeedback2, LinearLayout linearLayout2, C10427f fVar, C10428g gVar, LayerView layerView3, Group group, LayerView layerView4, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, ImageView imageView, AppCompatTextView appCompatTextView4, SmallStepsView smallStepsView, LayerView layerView5, TextBadgeView textBadgeView, AppCompatImageView appCompatImageView, LinearLayout linearLayout3, TwoLineTextItem twoLineTextItem, LinearLayout linearLayout4, FrameLayout frameLayout3, ViewPager2 viewPager2, Input input2, TypingAnimationView typingAnimationView) {
        this.f29671d = constraintLayout;
        this.f29672e = accountPickerView;
        this.f29673f = frameLayout;
        this.f29674g = frameLayout2;
        this.f29675h = linearLayout;
        this.f29676i = chipGroup;
        this.f29677j = layerView;
        this.f29678k = view;
        this.f29679l = input;
        this.f29680m = layerView2;
        this.f29681n = appCompatTextView;
        this.f29682o = inlineFeedback2;
        this.f29683p = linearLayout2;
        this.f29684q = fVar;
        this.f29685r = gVar;
        this.f29686s = layerView3;
        this.f29687t = group;
        this.f29688u = layerView4;
        this.f29689v = appCompatTextView2;
        this.f29690w = appCompatTextView3;
        this.f29691x = imageView;
        this.f29692y = appCompatTextView4;
        this.f29693z = smallStepsView;
        this.f29661A = layerView5;
        this.f29662B = textBadgeView;
        this.f29663C = appCompatImageView;
        this.f29664D = linearLayout3;
        this.f29665E = twoLineTextItem;
        this.f29666F = linearLayout4;
        this.f29667G = frameLayout3;
        this.f29668H = viewPager2;
        this.f29669I = input2;
        this.f29670J = typingAnimationView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
        r1 = p653wf.C18588q.f52165p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0084, code lost:
        r1 = p653wf.C18588q.file_attachment_layout;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p376cg.C10429h m37882a(android.view.View r37) {
        /*
            r0 = r37
            int r1 = p653wf.C18588q.account_selector
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            ge.bog.designsystem.components.accountpicker.AccountPickerView r5 = (p341ge.bog.designsystem.components.accountpicker.AccountPickerView) r5
            if (r5 == 0) goto L_0x017e
            int r1 = p653wf.C18588q.f52162i
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            if (r6 == 0) goto L_0x017e
            int r1 = p653wf.C18588q.bubble_layout
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            if (r7 == 0) goto L_0x017e
            int r1 = p653wf.C18588q.calendar_range
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            if (r8 == 0) goto L_0x017e
            int r1 = p653wf.C18588q.chips_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            ge.bog.designsystem.components.chips.ChipGroup r9 = (p341ge.bog.designsystem.components.chips.ChipGroup) r9
            if (r9 == 0) goto L_0x017e
            int r1 = p653wf.C18588q.dislike_chip
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r10 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r10
            if (r10 == 0) goto L_0x017e
            int r1 = p653wf.C18588q.f52165p
            android.view.View r11 = p086g1.C6202b.m24689a(r0, r1)
            if (r11 == 0) goto L_0x017e
            int r1 = p653wf.C18588q.f52169v
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            ge.bog.designsystem.components.input.Input r12 = (p341ge.bog.designsystem.components.input.Input) r12
            if (r12 == 0) goto L_0x017e
            int r1 = p653wf.C18588q.faq_layout
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r13 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r13
            if (r13 == 0) goto L_0x017e
            int r1 = p653wf.C18588q.faq_title
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            androidx.appcompat.widget.AppCompatTextView r14 = (androidx.appcompat.widget.AppCompatTextView) r14
            if (r14 == 0) goto L_0x017e
            int r1 = p653wf.C18588q.f52148B
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2 r15 = (p341ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2) r15
            if (r15 == 0) goto L_0x017e
            int r1 = p653wf.C18588q.f52150C
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r16 = r2
            android.widget.LinearLayout r16 = (android.widget.LinearLayout) r16
            if (r16 == 0) goto L_0x017e
            int r1 = p653wf.C18588q.file_attachment_layout
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x017e
            cg.f r17 = p376cg.C10427f.m37876a(r2)
            int r1 = p653wf.C18588q.image_attachment_layout
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x017e
            cg.g r18 = p376cg.C10428g.m37879a(r2)
            int r1 = p653wf.C18588q.like_chip
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r19 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r19 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r19
            if (r19 == 0) goto L_0x017e
            int r1 = p653wf.C18588q.messageAuthorGroup
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r20 = r2
            androidx.constraintlayout.widget.Group r20 = (androidx.constraintlayout.widget.Group) r20
            if (r20 == 0) goto L_0x017e
            int r1 = p653wf.C18588q.message_loader
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r21 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r21 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r21
            if (r21 == 0) goto L_0x017e
            int r1 = p653wf.C18588q.messageStatus
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r22 = r2
            androidx.appcompat.widget.AppCompatTextView r22 = (androidx.appcompat.widget.AppCompatTextView) r22
            if (r22 == 0) goto L_0x017e
            int r1 = p653wf.C18588q.f52158Z
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r23 = r2
            androidx.appcompat.widget.AppCompatTextView r23 = (androidx.appcompat.widget.AppCompatTextView) r23
            if (r23 == 0) goto L_0x017e
            int r1 = p653wf.C18588q.f52159a0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r24 = r2
            android.widget.ImageView r24 = (android.widget.ImageView) r24
            if (r24 == 0) goto L_0x017e
            int r1 = p653wf.C18588q.participantName
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r25 = r2
            androidx.appcompat.widget.AppCompatTextView r25 = (androidx.appcompat.widget.AppCompatTextView) r25
            if (r25 == 0) goto L_0x017e
            int r1 = p653wf.C18588q.pre_contract
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r26 = r2
            ge.bog.designsystem.components.smallsteps.SmallStepsView r26 = (p341ge.bog.designsystem.components.smallsteps.SmallStepsView) r26
            if (r26 == 0) goto L_0x017e
            int r1 = p653wf.C18588q.f52163k0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r27 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r27 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r27
            if (r27 == 0) goto L_0x017e
            int r1 = p653wf.C18588q.product_badge
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r28 = r2
            ge.bog.designsystem.components.textbadge.TextBadgeView r28 = (p341ge.bog.designsystem.components.textbadge.TextBadgeView) r28
            if (r28 == 0) goto L_0x017e
            int r1 = p653wf.C18588q.product_image
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r29 = r2
            androidx.appcompat.widget.AppCompatImageView r29 = (androidx.appcompat.widget.AppCompatImageView) r29
            if (r29 == 0) goto L_0x017e
            int r1 = p653wf.C18588q.product_offer_items
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r30 = r2
            android.widget.LinearLayout r30 = (android.widget.LinearLayout) r30
            if (r30 == 0) goto L_0x017e
            int r1 = p653wf.C18588q.product_type
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r31 = r2
            ge.bog.designsystem.components.list.TwoLineTextItem r31 = (p341ge.bog.designsystem.components.list.TwoLineTextItem) r31
            if (r31 == 0) goto L_0x017e
            int r1 = p653wf.C18588q.products_slider
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r32 = r2
            android.widget.LinearLayout r32 = (android.widget.LinearLayout) r32
            if (r32 == 0) goto L_0x017e
            int r1 = p653wf.C18588q.products_slider_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r33 = r2
            android.widget.FrameLayout r33 = (android.widget.FrameLayout) r33
            if (r33 == 0) goto L_0x017e
            int r1 = p653wf.C18588q.f52166r0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r34 = r2
            androidx.viewpager2.widget.ViewPager2 r34 = (androidx.viewpager2.widget.ViewPager2) r34
            if (r34 == 0) goto L_0x017e
            int r1 = p653wf.C18588q.f52171w0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r35 = r2
            ge.bog.designsystem.components.input.Input r35 = (p341ge.bog.designsystem.components.input.Input) r35
            if (r35 == 0) goto L_0x017e
            int r1 = p653wf.C18588q.typingView
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r36 = r2
            ge.bog.chat.presentation.view.TypingAnimationView r36 = (p341ge.bog.chat.presentation.view.TypingAnimationView) r36
            if (r36 == 0) goto L_0x017e
            cg.h r1 = new cg.h
            r3 = r1
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            return r1
        L_0x017e:
            android.content.res.Resources r0 = r37.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p376cg.C10429h.m37882a(android.view.View):cg.h");
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f29671d;
    }
}
