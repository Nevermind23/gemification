package p341ge.bog.mobilebank.stories.presentation.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import c61.C31278c;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o61.C37660b;
import x51.C39791c;

/* renamed from: ge.bog.mobilebank.stories.presentation.customview.PageIndicatorView */
public final class PageIndicatorView extends LinearLayout {

    /* renamed from: d */
    private final ArrayList f84061d;

    /* renamed from: e */
    private List f84062e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PageIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: a */
    private final void m102249a(C37660b bVar) {
        int dimension = (int) getContext().getResources().getDimension(C39791c.f94495a);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, dimension);
        layoutParams.setMarginStart(dimension);
        layoutParams.setMarginEnd(dimension);
        layoutParams.weight = 1.0f;
        C31278c d = C31278c.m92903d(LayoutInflater.from(getContext()), this, false);
        C41536l.m120488h(d, "inflate(LayoutInflater.from(context), this, false)");
        d.f77668e.setLayoutParams(layoutParams);
        d.f77668e.setProgress(bVar.mo90841a());
        addView(d.f77668e);
        this.f84061d.add(d.f77668e);
    }

    /* renamed from: b */
    private final void m102250b(List list) {
        this.f84061d.clear();
        removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m102249a((C37660b) it.next());
        }
    }

    /* renamed from: c */
    private final void m102251c(List list) {
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                C41341q.m119917t();
            }
            m102252d(i, (C37660b) next);
            i = i2;
        }
    }

    /* renamed from: d */
    private final void m102252d(int i, C37660b bVar) {
        ProgressBar progressBar = (ProgressBar) C41358y.m120010Z(this.f84061d, i);
        if (progressBar != null) {
            progressBar.setProgress(bVar.mo90841a());
        }
    }

    public final List<C37660b> getData() {
        return this.f84062e;
    }

    public final void setData(List<C37660b> list) {
        C41536l.m120489i(list, C11755a.C11756a.f34100b);
        if (this.f84062e.size() == list.size()) {
            m102251c(list);
        } else {
            m102250b(list);
        }
        this.f84062e = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PageIndicatorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PageIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        this.f84061d = new ArrayList();
        this.f84062e = C41341q.m119907j();
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setGravity(17);
    }
}
