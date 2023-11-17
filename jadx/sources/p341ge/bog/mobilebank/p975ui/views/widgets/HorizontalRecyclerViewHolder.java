package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32335t0;
import g91.C32355x0;
import p366bk.C10313b;
import p366bk.C10319h;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.HorizontalRecyclerViewHolder */
public class HorizontalRecyclerViewHolder extends FrameLayout {
    public static final int STATE_EMPTY = 3;
    public static final int STATE_ERROR = 1;
    public static final int STATE_LOADING = 0;
    public static final int STATE_READY = 2;
    public static final String TRANSFER_TEMPLATE_TYPE = "TRANSFER_TEMPLATE_TYPE";
    private View emptyLayout;
    /* access modifiers changed from: private */
    public Runnable emptyRunnable;
    private View errorButton;
    private View errorLayout;
    /* access modifiers changed from: private */
    public Runnable executableRunnable;
    private Animation infiniteAlphaAnim;
    private int lastState;
    private View[] layouts;
    private View loadingLayout;
    private RecyclerView recyclerView;
    private String type;

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.HorizontalRecyclerViewHolder$a */
    class C35739a implements View.OnClickListener {
        C35739a() {
        }

        public void onClick(View view) {
            if (HorizontalRecyclerViewHolder.this.executableRunnable != null) {
                HorizontalRecyclerViewHolder.this.executableRunnable.run();
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.HorizontalRecyclerViewHolder$b */
    class C35740b implements View.OnClickListener {
        C35740b() {
        }

        public void onClick(View view) {
            if (HorizontalRecyclerViewHolder.this.emptyRunnable != null) {
                HorizontalRecyclerViewHolder.this.emptyRunnable.run();
            }
        }
    }

    public HorizontalRecyclerViewHolder(Context context) {
        this(context, (AttributeSet) null);
    }

    private void showView(View view) {
        for (View view2 : this.layouts) {
            if (view2 == view) {
                view2.setVisibility(0);
            } else {
                view2.setVisibility(8);
            }
        }
    }

    public View getErrorLayout() {
        return this.errorLayout;
    }

    public View getLoadingLayout() {
        return this.loadingLayout;
    }

    public RecyclerView getRecyclerView() {
        return this.recyclerView;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setState(this.lastState);
    }

    public void setEmptyRunnable(Runnable runnable) {
        this.emptyRunnable = runnable;
    }

    public void setExecutableRunnable(Runnable runnable) {
        this.executableRunnable = runnable;
    }

    public void setState(int i) {
        this.lastState = i;
        if (i == 0) {
            showView(this.loadingLayout);
            this.loadingLayout.startAnimation(this.infiniteAlphaAnim);
        } else if (i == 1) {
            this.loadingLayout.clearAnimation();
            showView(this.errorLayout);
        } else if (i == 2) {
            this.loadingLayout.clearAnimation();
            showView(this.recyclerView);
        } else if (i == 3) {
            this.loadingLayout.clearAnimation();
            showView(this.emptyLayout);
        }
    }

    public void setType(String str) {
        this.type = str;
        if (str.equals(TRANSFER_TEMPLATE_TYPE)) {
            ((TextView) this.emptyLayout.findViewById(C10322k.empty_templates_text)).setText(getResources().getString(C10328q.templates_text_no_templates_transfers));
        }
    }

    public HorizontalRecyclerViewHolder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.layouts = new View[4];
        this.lastState = 0;
        this.type = "";
        this.recyclerView = new RecyclerView(context);
        this.errorLayout = LayoutInflater.from(context).inflate(C10324m.layout_horizontal_error, this, false);
        this.emptyLayout = LayoutInflater.from(context).inflate(C10324m.empty_templates_layout, this, false);
        this.loadingLayout = LayoutInflater.from(context).inflate(C10324m.layout_loading_horizontal_circular_items, this, false);
        View findViewById = this.errorLayout.findViewById(C10322k.horizontal_error_retry_button);
        this.errorButton = findViewById;
        findViewById.setOnClickListener(new C35739a());
        addView(this.recyclerView);
        addView(this.errorLayout);
        addView(this.loadingLayout);
        addView(this.emptyLayout);
        if (!isInEditMode()) {
            View[] viewArr = this.layouts;
            viewArr[0] = this.recyclerView;
            viewArr[1] = this.errorLayout;
            viewArr[2] = this.loadingLayout;
            viewArr[3] = this.emptyLayout;
            this.infiniteAlphaAnim = AnimationUtils.loadAnimation(context, C10313b.infinite_alpha);
            BogFlatButton bogFlatButton = new BogFlatButton(getContext());
            bogFlatButton.setTextSize(14);
            bogFlatButton.setText(getContext().getString(C10328q.templates_button_create), C32335t0.m95367l(context, true), true, false);
            bogFlatButton.setOnClickListener(new C35740b());
            int i = C10319h.create_template_button_padding;
            bogFlatButton.setPadding(C32355x0.m95516g(i), 0, C32355x0.m95516g(i), 0);
            ((ViewGroup) this.emptyLayout.findViewById(C10322k.f28821b5)).addView(bogFlatButton);
        }
    }
}
