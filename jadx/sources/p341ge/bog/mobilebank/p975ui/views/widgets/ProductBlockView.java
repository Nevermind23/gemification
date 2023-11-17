package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.C0767a;
import g91.C32290b1;
import g91.C32355x0;
import p366bk.C10318g;
import p366bk.C10319h;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.ProductBlockView */
public class ProductBlockView extends FrameLayout {
    private ImageView cardBlockImageView;
    private View redContainer;
    private BogTextView textView;

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.ProductBlockView$a */
    class C35758a implements ViewTreeObserver.OnGlobalLayoutListener {
        C35758a() {
        }

        public void onGlobalLayout() {
            View view = new View(ProductBlockView.this.getContext());
            view.setLayoutParams(new FrameLayout.LayoutParams(ProductBlockView.this.getWidth(), C32355x0.m95516g(C10319h.card_blocked_container_height), 80));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(ProductBlockView.this.getContext().getResources().getDimension(C10319h.account_item_view_info_radius));
            gradientDrawable.setGradientType(0);
            gradientDrawable.setColors(new int[]{C32355x0.m95514e(C10318g.f28649t2, ProductBlockView.this.getContext()), C32355x0.m95514e(C10318g.bog_black_color, ProductBlockView.this.getContext())});
            view.setBackground(gradientDrawable);
            view.setAlpha(0.15f);
            ProductBlockView.this.addView(view, 0);
            C32355x0.m95523n(ProductBlockView.this, this);
        }
    }

    public ProductBlockView(Context context) {
        super(context, (AttributeSet) null);
    }

    private void setUpView() {
        this.cardBlockImageView = (ImageView) findViewById(C10322k.block_image_view);
        this.textView = (BogTextView) findViewById(C10322k.block_text);
        this.redContainer = findViewById(C10322k.card_blocked_container);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(getContext().getResources().getDimension(C10319h.account_item_view_info_radius));
        gradientDrawable.setColor(C32355x0.m95514e(C10318g.account_item_info_red_color, getContext()));
        this.redContainer.setBackground(gradientDrawable);
        this.cardBlockImageView.setImageDrawable(C32290b1.m95122l(getContext(), C0767a.m2895e(getContext(), C10320i.ic_info), C10318g.f28616A));
    }

    public void setText(String str) {
        this.textView.setText(str);
        if (getChildCount() == 1) {
            getViewTreeObserver().addOnGlobalLayoutListener(new C35758a());
        }
    }

    public ProductBlockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(getContext(), C10324m.product_block_view, this);
        if (!isInEditMode()) {
            setUpView();
        }
    }
}
