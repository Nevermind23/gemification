package p503lg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.chat.domain.model.components.ProductSliderBodyItem;
import p341ge.bog.chat.domain.model.components.ProductSliderHeaderBadge;
import p341ge.bog.chat.domain.model.components.ProductsSliderComponent;
import p341ge.bog.designsystem.components.common.Image;
import p376cg.C10433l;
import p447hg.C15499c;
import p615tg.C17963d;
import p642vh.C18368l;
import p653wf.C18586o;
import p653wf.C18591t;
import p697zh.C19025c;
import ue1.C43075l;
import vg1.C43167a;

/* renamed from: lg.j */
public final class C16570j extends C1819o {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C16571a f46735f;

    /* renamed from: lg.j$a */
    public interface C16571a {
        /* renamed from: a */
        void mo43705a(String str);
    }

    /* renamed from: lg.j$b */
    public final class C16572b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C10433l f46736d;

        /* renamed from: e */
        final /* synthetic */ C16570j f46737e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16572b(C16570j jVar, C10433l lVar) {
            super(lVar.mo3946b());
            C41536l.m120489i(lVar, "binding");
            this.f46737e = jVar;
            this.f46736d = lVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m58827j(C16570j jVar, ProductsSliderComponent productsSliderComponent, View view) {
            C41536l.m120489i(jVar, "this$0");
            C41536l.m120489i(productsSliderComponent, "$component");
            C16571a k = jVar.f46735f;
            if (k != null) {
                k.mo43705a(productsSliderComponent.getHeader().getTitle());
            }
        }

        /* renamed from: i */
        public final void mo43714i(ProductsSliderComponent productsSliderComponent) {
            boolean z;
            int i;
            C19025c.C19026a aVar;
            ViewGroup.MarginLayoutParams marginLayoutParams;
            String rightText;
            String middleText;
            String leftText;
            C41536l.m120489i(productsSliderComponent, "component");
            this.f46736d.mo3946b().setOnClickListener(new C16573k(this.f46737e, productsSliderComponent));
            C10433l lVar = this.f46736d;
            ImageView imageView = lVar.f29707f;
            C41536l.m120488h(imageView, "iconImage");
            C18368l.m62746A(imageView, new Image.Resource(C15499c.m56061d(productsSliderComponent.getHeader().getProductType()), (Boolean) null, 2, (DefaultConstructorMarker) null), (C43075l) null, 2, (Object) null);
            lVar.f29714m.setText(productsSliderComponent.getHeader().getTitle());
            lVar.f29712k.setText(productsSliderComponent.getHeader().getMinAmountTitle());
            lVar.f29713l.setText(productsSliderComponent.getHeader().getMinAmountValue());
            TextView textView = lVar.f29711j;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            ProductSliderHeaderBadge badge = productsSliderComponent.getHeader().getBadge();
            if (!(badge == null || (leftText = badge.getLeftText()) == null)) {
                spannableStringBuilder.append(leftText, new TextAppearanceSpan(this.f46736d.mo3946b().getContext(), C18591t.f52174b), 33);
            }
            ProductSliderHeaderBadge badge2 = productsSliderComponent.getHeader().getBadge();
            if (!(badge2 == null || (middleText = badge2.getMiddleText()) == null)) {
                spannableStringBuilder.append(middleText, new TextAppearanceSpan(this.f46736d.mo3946b().getContext(), C18591t.f52175c), 33);
            }
            ProductSliderHeaderBadge badge3 = productsSliderComponent.getHeader().getBadge();
            if (!(badge3 == null || (rightText = badge3.getRightText()) == null)) {
                spannableStringBuilder.append(rightText, new TextAppearanceSpan(this.f46736d.mo3946b().getContext(), C18591t.f52174b), 33);
            }
            textView.setText(spannableStringBuilder);
            LinearLayout linearLayout = lVar.f29708g;
            C41536l.m120488h(linearLayout, "infoLayer");
            if (productsSliderComponent.getHeader().getAdditionalInfo() != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            linearLayout.setVisibility(i);
            String additionalInfo = productsSliderComponent.getHeader().getAdditionalInfo();
            if (additionalInfo != null) {
                lVar.f29709h.setText(additionalInfo);
            }
            for (ProductSliderBodyItem productSliderBodyItem : productsSliderComponent.getBody()) {
                LinearLayout linearLayout2 = this.f46736d.f29706e;
                Context context = this.f46736d.mo3946b().getContext();
                C41536l.m120488h(context, "binding.root.context");
                C19025c cVar = new C19025c(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                if (productSliderBodyItem.isPositive()) {
                    aVar = C19025c.C19026a.POSITIVE;
                } else {
                    aVar = C19025c.C19026a.NEGATIVE;
                }
                cVar.setType(aVar);
                cVar.setText(productSliderBodyItem.getTitle());
                ViewGroup.LayoutParams layoutParams = cVar.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = null;
                }
                if (marginLayoutParams != null) {
                    Context context2 = this.f46736d.mo3946b().getContext();
                    C41536l.m120488h(context2, "binding.root.context");
                    marginLayoutParams.setMargins(0, C43167a.m123815a(context2, C18586o.f52136i), 0, 0);
                }
                linearLayout2.addView(cVar);
            }
        }
    }

    public C16570j() {
        super(C17963d.f51158a.mo45633d());
    }

    /* renamed from: l */
    public void onBindViewHolder(C16572b bVar, int i) {
        C41536l.m120489i(bVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        bVar.mo43714i((ProductsSliderComponent) g);
    }

    /* renamed from: m */
    public C16572b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C10433l d = C10433l.m37897d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …      false\n            )");
        return new C16572b(this, d);
    }

    /* renamed from: n */
    public final void mo43713n(C16571a aVar) {
        C41536l.m120489i(aVar, "productChosenListener");
        this.f46735f = aVar;
    }
}
