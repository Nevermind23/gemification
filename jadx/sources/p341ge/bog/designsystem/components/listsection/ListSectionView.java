package p341ge.bog.designsystem.components.listsection;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0767a;
import com.bumptech.glide.C2394j;
import he1.C41238w;
import java.util.ArrayList;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import p035c4.C2247a;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p352ak.C10047x3;
import p601sg.C17777b;
import p601sg.C17779d;
import p601sg.C17780e;
import p601sg.C17786k;
import p601sg.C17787l;
import p642vh.C18355e0;
import p642vh.C18368l;
import p642vh.C18377p;
import p643vi.C18390a;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.listsection.ListSectionView */
public final class ListSectionView extends LayerView {

    /* renamed from: l */
    static final /* synthetic */ C40303i[] f39766l;

    /* renamed from: d */
    private final C10047x3 f39767d;

    /* renamed from: e */
    private final C18377p f39768e;

    /* renamed from: f */
    private Image f39769f;

    /* renamed from: g */
    private final C18355e0 f39770g;

    /* renamed from: h */
    private final C18355e0 f39771h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C13372c f39772i;

    /* renamed from: j */
    private final C41555e f39773j;

    /* renamed from: k */
    private View.OnClickListener f39774k;

    /* renamed from: ge.bog.designsystem.components.listsection.ListSectionView$a */
    public static abstract class C13370a {

        /* renamed from: a */
        private final ArrayList f39775a = new ArrayList();

        /* renamed from: a */
        public final void mo36126a(C13371b bVar) {
            C41536l.m120489i(bVar, "dataChangeObserver");
            this.f39775a.add(bVar);
        }

        /* renamed from: b */
        public abstract int mo36127b();

        /* renamed from: c */
        public abstract View mo36128c(int i, ViewGroup viewGroup);

        /* renamed from: d */
        public final void mo36129d(C13371b bVar) {
            C41536l.m120489i(bVar, "dataChangeObserver");
            this.f39775a.remove(bVar);
        }
    }

    /* renamed from: ge.bog.designsystem.components.listsection.ListSectionView$b */
    public interface C13371b {
    }

    /* renamed from: ge.bog.designsystem.components.listsection.ListSectionView$c */
    public static final class C13372c implements C13371b {

        /* renamed from: a */
        final /* synthetic */ ListSectionView f39776a;

        C13372c(ListSectionView listSectionView) {
            this.f39776a = listSectionView;
        }
    }

    /* renamed from: ge.bog.designsystem.components.listsection.ListSectionView$d */
    static final class C13373d extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C13373d f39777d = new C13373d();

        C13373d() {
            super(1);
        }

        /* renamed from: a */
        public final C2394j invoke(C2394j jVar) {
            C41536l.m120489i(jVar, "$this$setImage");
            C2247a c0 = jVar.mo7220c0(C17780e.f49662k1);
            C41536l.m120488h(c0, "placeholder(R.drawable.thumbnail_1_1)");
            return (C2394j) c0;
        }
    }

    /* renamed from: ge.bog.designsystem.components.listsection.ListSectionView$e */
    public static final class C13374e extends C41553c {

        /* renamed from: a */
        final /* synthetic */ ListSectionView f39778a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13374e(Object obj, ListSectionView listSectionView) {
            super(obj);
            this.f39778a = listSectionView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            C13370a aVar = (C13370a) obj2;
            C13370a aVar2 = (C13370a) obj;
            if (aVar2 != null) {
                aVar2.mo36129d(this.f39778a.f39772i);
            }
            if (aVar != null) {
                aVar.mo36126a(this.f39778a.f39772i);
            }
            this.f39778a.m50308e();
        }
    }

    static {
        Class<ListSectionView> cls = ListSectionView.class;
        f39766l = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "listSectionImage", "getListSectionImage()I", 0)), C41520a0.m120439e(new C41539o(cls, "title", "getTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "subTitle", "getSubTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "adapter", "getAdapter()Lge/bog/designsystem/components/listsection/ListSectionView$Adapter;", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ListSectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m50305b(ListSectionView listSectionView, View view) {
        C41536l.m120489i(listSectionView, "this$0");
        View.OnClickListener onClickListener = listSectionView.f39774k;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m50308e() {
        int i;
        boolean z;
        this.f39767d.f27746e.removeAllViews();
        View view = this.f39767d.f27751j;
        C41536l.m120488h(view, "binding.topSeparator");
        C13370a adapter = getAdapter();
        if (adapter != null) {
            i = adapter.mo36127b();
        } else {
            i = 0;
        }
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C18368l.m62751F(view, z, false, 2, (Object) null);
        C13370a adapter2 = getAdapter();
        if (adapter2 != null) {
            int b = adapter2.mo36127b();
            for (int i2 = 0; i2 < b; i2++) {
                LinearLayout linearLayout = this.f39767d.f27746e;
                C41536l.m120488h(linearLayout, "binding.container");
                this.f39767d.f27746e.addView(adapter2.mo36128c(i2, linearLayout));
                if (i2 != adapter2.mo36127b() - 1) {
                    View view2 = new View(getContext());
                    view2.setLayoutParams(new LinearLayout.LayoutParams(-1, getContext().getResources().getDimensionPixelSize(C17779d.list_section_separator_height)));
                    view2.setBackgroundResource(C17780e.f49660V);
                    this.f39767d.f27746e.addView(view2);
                }
            }
        }
    }

    public static /* synthetic */ void getListSectionImage$annotations() {
    }

    public final C13370a getAdapter() {
        return (C13370a) this.f39773j.getValue(this, f39766l[3]);
    }

    public final Image getImage() {
        return this.f39769f;
    }

    public final int getListSectionImage() {
        return this.f39768e.getValue(this, f39766l[0]).intValue();
    }

    public final CharSequence getSubTitle() {
        return this.f39771h.getValue(this, f39766l[2]);
    }

    public final CharSequence getTitle() {
        return this.f39770g.getValue(this, f39766l[1]);
    }

    public final void setAdapter(C13370a aVar) {
        this.f39773j.setValue(this, f39766l[3], aVar);
    }

    public final void setButtonIcon(int i) {
        this.f39767d.f27747f.setButtonIcon(C0767a.m2895e(getContext(), i));
    }

    public final void setImage(Image image) {
        C41238w wVar;
        if (image != null) {
            ImageView imageView = this.f39767d.f27748g;
            C41536l.m120488h(imageView, "binding.listSectionImage");
            C18368l.m62777z(imageView, image, C13373d.f39777d);
            wVar = C41238w.f97225a;
        } else {
            wVar = null;
        }
        if (wVar == null) {
            ImageView imageView2 = this.f39767d.f27748g;
            C41536l.m120488h(imageView2, "binding.listSectionImage");
            C18368l.m62746A(imageView2, new Image.Resource(C17780e.f49662k1, (Boolean) null, 2, (DefaultConstructorMarker) null), (C43075l) null, 2, (Object) null);
        }
    }

    public final void setListSectionImage(int i) {
        this.f39768e.setValue(this, f39766l[0], Integer.valueOf(i));
    }

    public final void setOnButtonClickListener(View.OnClickListener onClickListener) {
        C41536l.m120489i(onClickListener, "listener");
        this.f39774k = onClickListener;
    }

    public final void setSubTitle(CharSequence charSequence) {
        this.f39771h.setValue(this, f39766l[2], charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.f39770g.setValue(this, f39766l[1], charSequence);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ListSectionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListSectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        C10047x3 d = C10047x3.m36852d(LayoutInflater.from(context), this, true);
        C41536l.m120488h(d, "inflate(\n        LayoutI…ontext), this, true\n    )");
        this.f39767d = d;
        ImageView imageView = d.f27748g;
        C41536l.m120488h(imageView, "binding.listSectionImage");
        this.f39768e = new C18377p(imageView);
        TextView textView = d.f27750i;
        C41536l.m120488h(textView, "binding.listSectionTitle");
        this.f39770g = new C18355e0(textView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        TextView textView2 = d.f27749h;
        C41536l.m120488h(textView2, "binding.listSectionSubtitle");
        this.f39771h = new C18355e0(textView2, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        this.f39772i = new C13372c(this);
        C41551a aVar = C41551a.f97718a;
        this.f39773j = new C13374e((Object) null, this);
        setLayerStyle(C17786k.f49834t);
        setBackgroundColor(C18368l.m62755d(context2, C17777b.f49596k));
        int[] iArr = C17787l.f50478p7;
        C41536l.m120488h(iArr, "ListSectionView");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        setTitle(obtainStyledAttributes.getString(C17787l.f50542t7));
        setSubTitle(obtainStyledAttributes.getString(C17787l.f50526s7));
        setListSectionImage(obtainStyledAttributes.getResourceId(C17787l.f50510r7, -1));
        setButtonIcon(obtainStyledAttributes.getResourceId(C17787l.f50494q7, C17780e.f49653K));
        obtainStyledAttributes.recycle();
        d.f27747f.setOnClickListener(new C18390a(this));
    }
}
