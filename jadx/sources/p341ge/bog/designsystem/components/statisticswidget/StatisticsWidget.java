package p341ge.bog.designsystem.components.statisticswidget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.content.C0767a;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayout;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.progressbadge.ProgressBadgeView;
import p341ge.bog.designsystem.components.textprogressbar.TextProgressBarView;
import p352ak.C9972n0;
import p408ej.C12476a;
import p422fj.C12918a;
import p492kj.C16434a;
import p492kj.C16435b;
import p492kj.C16436c;
import p492kj.C16437d;
import p492kj.C16438e;
import p492kj.C16439f;
import p492kj.C16440g;
import p492kj.C16444h;
import p492kj.C16445i;
import p601sg.C17779d;
import p642vh.C18368l;

/* renamed from: ge.bog.designsystem.components.statisticswidget.StatisticsWidget */
public final class StatisticsWidget extends FrameLayout {

    /* renamed from: d */
    private final C9972n0 f40330d;

    /* renamed from: ge.bog.designsystem.components.statisticswidget.StatisticsWidget$a */
    public static final class C13511a implements View.OnLayoutChangeListener {

        /* renamed from: d */
        final /* synthetic */ List f40331d;

        /* renamed from: e */
        final /* synthetic */ C9972n0 f40332e;

        /* renamed from: f */
        final /* synthetic */ StatisticsWidget f40333f;

        public C13511a(List list, C9972n0 n0Var, StatisticsWidget statisticsWidget) {
            this.f40331d = list;
            this.f40332e = n0Var;
            this.f40333f = statisticsWidget;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C41536l.m120489i(view, "view");
            view.removeOnLayoutChangeListener(this);
            for (C12476a type : this.f40331d) {
                FlexboxLayout flexboxLayout = this.f40332e.f27292k;
                Context context = this.f40333f.getContext();
                C41536l.m120488h(context, "context");
                ProgressBadgeView progressBadgeView = new ProgressBadgeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                progressBadgeView.setType(type);
                progressBadgeView.setWidth(this.f40333f.m50677e(this.f40331d.size()));
                flexboxLayout.addView(progressBadgeView);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StatisticsWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final int m50677e(int i) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(C17779d.progress_badge_space);
        return ((getMeasuredWidth() - (getResources().getDimensionPixelSize(C17779d.progress_badge_container_margin) * 2)) - ((i - 1) * dimensionPixelSize)) / i;
    }

    /* renamed from: g */
    private final C41238w m50678g(C16435b bVar) {
        boolean z;
        boolean z2;
        C9972n0 n0Var = this.f40330d;
        n0Var.f27289h.setTitle(bVar.mo43568d());
        n0Var.f27289h.setText(bVar.mo43567c());
        EmptyWidget emptyWidget = n0Var.f27289h;
        Boolean b = bVar.mo43566b();
        if (b != null) {
            z = b.booleanValue();
        } else {
            z = false;
        }
        emptyWidget.setEnableMultiLineSubtitle(z);
        FrameLayout frameLayout = n0Var.f27286e;
        C41536l.m120488h(frameLayout, "actionLayout");
        if (bVar.mo43565a() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C18368l.m62751F(frameLayout, z2, false, 2, (Object) null);
        Button button = n0Var.f27291j;
        C41536l.m120488h(button, "iconTextButton");
        C18368l.m62751F(button, false, false, 2, (Object) null);
        Button button2 = n0Var.f27293l;
        C41536l.m120488h(button2, "smallTextButton");
        C18368l.m62751F(button2, false, false, 2, (Object) null);
        Button button3 = n0Var.f27290i;
        C41536l.m120488h(button3, "iconButton");
        C18368l.m62751F(button3, false, false, 2, (Object) null);
        C16440g a = bVar.mo43565a();
        if (a == null) {
            return null;
        }
        if (a instanceof C16440g.C16442b) {
            C16440g.C16442b bVar2 = (C16440g.C16442b) a;
            n0Var.f27291j.setButtonText(bVar2.mo43587c());
            n0Var.f27291j.setButtonIcon(C0767a.m2895e(getContext(), bVar2.mo43586b()));
            n0Var.f27291j.setOnClickListener(new C16437d(a));
            Button button4 = n0Var.f27291j;
            C41536l.m120488h(button4, "iconTextButton");
            C18368l.m62751F(button4, true, false, 2, (Object) null);
        } else if (a instanceof C16440g.C16443c) {
            n0Var.f27293l.setButtonText(((C16440g.C16443c) a).mo43591b());
            n0Var.f27293l.setOnClickListener(new C16438e(a));
            Button button5 = n0Var.f27293l;
            C41536l.m120488h(button5, "smallTextButton");
            C18368l.m62751F(button5, true, false, 2, (Object) null);
        } else if (a instanceof C16440g.C16441a) {
            C16440g.C16441a aVar = (C16440g.C16441a) a;
            n0Var.f27290i.setButtonIcon(C0767a.m2895e(getContext(), aVar.mo43581b()));
            Integer c = aVar.mo43582c();
            if (c != null) {
                n0Var.f27290i.setButtonIconTint(C0767a.m2894d(this.f40330d.mo3946b().getContext(), c.intValue()));
            }
            n0Var.f27290i.setOnClickListener(new C16439f(a));
            Button button6 = n0Var.f27290i;
            C41536l.m120488h(button6, "iconButton");
            C18368l.m62751F(button6, true, false, 2, (Object) null);
        }
        return C41238w.f97225a;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final void m50679h(C16440g gVar, View view) {
        C41536l.m120489i(gVar, "$button");
        gVar.mo43580a().invoke();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final void m50680i(C16440g gVar, View view) {
        C41536l.m120489i(gVar, "$button");
        gVar.mo43580a().invoke();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m50681j(C16440g gVar, View view) {
        C41536l.m120489i(gVar, "$button");
        gVar.mo43580a().invoke();
    }

    private final void setupFeedback(C16434a aVar) {
        InlineFeedback inlineFeedback = this.f40330d.f27288g;
        inlineFeedback.setTitleText(aVar.mo43561b());
        inlineFeedback.setInlineFeedbackState(aVar.mo43560a());
    }

    private final void setupProgressBadges(List<? extends C12476a> list) {
        C9972n0 n0Var = this.f40330d;
        n0Var.f27292k.removeAllViews();
        if (!ViewCompat.m3579V(this) || isLayoutRequested()) {
            addOnLayoutChangeListener(new C13511a(list, n0Var, this));
            return;
        }
        for (C12476a type : list) {
            FlexboxLayout flexboxLayout = n0Var.f27292k;
            Context context = getContext();
            C41536l.m120488h(context, "context");
            ProgressBadgeView progressBadgeView = new ProgressBadgeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            progressBadgeView.setType(type);
            progressBadgeView.setWidth(m50677e(list.size()));
            flexboxLayout.addView(progressBadgeView);
        }
    }

    private final void setupStatisticsList(List<C16436c> list) {
        C16445i iVar = new C16445i();
        this.f40330d.f27294m.setAdapter(iVar);
        iVar.mo6029i(list);
    }

    private final void setupTextProgress(TextProgressBarView.ProgressModel progressModel) {
        TextProgressBarView textProgressBarView = this.f40330d.f27295n;
        textProgressBarView.setBudget(progressModel);
        textProgressBarView.setProgressBarThicknessType(C12918a.THICK);
    }

    /* renamed from: f */
    public final C41238w mo36729f(C16444h hVar) {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        C41536l.m120489i(hVar, "data");
        C9972n0 n0Var = this.f40330d;
        boolean z5 = true;
        if (hVar.mo43596b() != null) {
            z = true;
        } else {
            z = false;
        }
        LinearLayout linearLayout = n0Var.f27287f;
        C41536l.m120488h(linearLayout, "container");
        if (z) {
            i = 0;
        } else {
            i = getResources().getDimensionPixelSize(C17779d.f49642K1);
        }
        linearLayout.setPadding(linearLayout.getPaddingLeft(), i, linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        EmptyWidget emptyWidget = n0Var.f27289h;
        C41536l.m120488h(emptyWidget, "header");
        C18368l.m62751F(emptyWidget, z, false, 2, (Object) null);
        C16435b b = hVar.mo43596b();
        if (b != null) {
            m50678g(b);
        }
        FlexboxLayout flexboxLayout = n0Var.f27292k;
        C41536l.m120488h(flexboxLayout, "progressBadge");
        if (hVar.mo43597c() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C18368l.m62751F(flexboxLayout, z2, false, 2, (Object) null);
        List c = hVar.mo43597c();
        if (c != null) {
            setupProgressBadges(c);
        }
        TextProgressBarView textProgressBarView = n0Var.f27295n;
        C41536l.m120488h(textProgressBarView, "textProgress");
        if (hVar.mo43599e() != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        C18368l.m62751F(textProgressBarView, z3, false, 2, (Object) null);
        TextProgressBarView.ProgressModel e = hVar.mo43599e();
        if (e != null) {
            setupTextProgress(e);
        }
        InlineFeedback inlineFeedback = n0Var.f27288g;
        C41536l.m120488h(inlineFeedback, "feedback");
        if (hVar.mo43595a() != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        C18368l.m62751F(inlineFeedback, z4, false, 2, (Object) null);
        C16434a a = hVar.mo43595a();
        if (a != null) {
            setupFeedback(a);
        }
        RecyclerView recyclerView = n0Var.f27294m;
        C41536l.m120488h(recyclerView, "statisticsRecycler");
        if (hVar.mo43598d() == null) {
            z5 = false;
        }
        C18368l.m62751F(recyclerView, z5, false, 2, (Object) null);
        List d = hVar.mo43598d();
        if (d == null) {
            return null;
        }
        setupStatisticsList(d);
        return C41238w.f97225a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StatisticsWidget(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatisticsWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C9972n0 d = C9972n0.m36577d(LayoutInflater.from(context), this, true);
        C41536l.m120488h(d, "inflate(LayoutInflater.from(context), this, true)");
        this.f40330d = d;
    }
}
