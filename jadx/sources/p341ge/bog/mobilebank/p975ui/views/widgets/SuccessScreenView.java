package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.res.C0808h;
import com.github.mikephil.charting.utils.Utils;
import com.salesforce.marketingcloud.C11398b;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import g91.C32296c1;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Image;
import p366bk.C10318g;
import p366bk.C10321j;
import p90.C27331i7;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.SuccessScreenView */
public final class SuccessScreenView extends FrameLayout {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final int DETAILS_SYMBOL_BACKGROUND_COLOR = C10318g.success_screen_details_symbol_background_color;
    private static final int DETAILS_SYMBOL_TEXT_COLOR = C10318g.success_screen_details_symbol_text_color;
    private static final int DETAILS_TEXT_COLOR = C10318g.success_screen_details_text_color;
    private static final int HEADER_TEXT_COLOR = C10318g.success_screen_header_text_color;
    public static final int LEFT = 1;
    /* access modifiers changed from: private */
    public static final int NEGATIVE_TITLE_COLOR = C10318g.success_screen_negative_title_color;
    /* access modifiers changed from: private */
    public static final int POSITIVE_TITLE_COLOR = C10318g.success_screen_positive_title_color;
    public static final int RIGHT = 0;
    private final C27331i7 binding;

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.SuccessScreenView$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getNEGATIVE_TITLE_COLOR() {
            return SuccessScreenView.NEGATIVE_TITLE_COLOR;
        }

        public final int getPOSITIVE_TITLE_COLOR() {
            return SuccessScreenView.POSITIVE_TITLE_COLOR;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SuccessScreenView(Context context) {
        this(context, (AttributeSet) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    public static final void addActionButton$lambda$1(C43075l lVar, View view) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(view);
    }

    public static /* synthetic */ void addDetailsItem$default(SuccessScreenView successScreenView, String str, String str2, Integer num, int i, float f, int i2, Integer num2, Integer num3, Image image, int i3, Object obj) {
        String str3;
        Integer num4;
        int i4;
        float f2;
        int i5;
        Integer num5;
        Integer num6;
        int i6 = i3;
        if ((i6 & 2) != 0) {
            str3 = "";
        } else {
            str3 = str2;
        }
        Image image2 = null;
        if ((i6 & 4) != 0) {
            num4 = null;
        } else {
            num4 = num;
        }
        if ((i6 & 8) != 0) {
            i4 = 0;
        } else {
            i4 = i;
        }
        if ((i6 & 16) != 0) {
            f2 = 12.0f;
        } else {
            f2 = f;
        }
        if ((i6 & 32) != 0) {
            i5 = DETAILS_TEXT_COLOR;
        } else {
            i5 = i2;
        }
        if ((i6 & 64) != 0) {
            num5 = null;
        } else {
            num5 = num2;
        }
        if ((i6 & 128) != 0) {
            num6 = null;
        } else {
            num6 = num3;
        }
        if ((i6 & C11398b.f33139r) == 0) {
            image2 = image;
        }
        successScreenView.addDetailsItem(str, str3, num4, i4, f2, i5, num5, num6, image2);
    }

    public static /* synthetic */ void addHeader$default(SuccessScreenView successScreenView, String str, int i, float f, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = HEADER_TEXT_COLOR;
        }
        if ((i2 & 4) != 0) {
            f = 15.0f;
        }
        successScreenView.addHeader(str, i, f);
    }

    public static /* synthetic */ void setTitle$default(SuccessScreenView successScreenView, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = C10318g.success_screen_positive_title_color;
        }
        successScreenView.setTitle(str, i);
    }

    public final void addActionButton(String str, int i, C43075l lVar) {
        C41536l.m120489i(str, "title");
        C41536l.m120489i(lVar, UrlHandler.ACTION);
        if (this.binding.f68995e.getChildCount() != 3) {
            Context context = getContext();
            C41536l.m120488h(context, "context");
            BogActionButton bogActionButton = new BogActionButton(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            bogActionButton.setImage(i);
            bogActionButton.setText(str);
            bogActionButton.setOnClickListener(new C35821t(lVar));
            LinearLayout linearLayout = this.binding.f68995e;
            if (linearLayout != null) {
                linearLayout.addView(bogActionButton);
            }
        }
    }

    public final void addDetailsItem(String str) {
        C41536l.m120489i(str, "key");
        addDetailsItem$default(this, str, (String) null, (Integer) null, 0, Utils.FLOAT_EPSILON, 0, (Integer) null, (Integer) null, (Image) null, 510, (Object) null);
    }

    public final void addDetailsItemWithSymbol(String str, String str2) {
        C41536l.m120489i(str, "key");
        C41536l.m120489i(str2, "symbol");
        Context context = getContext();
        C41536l.m120488h(context, "context");
        SuccessScreenDetailsItem successScreenDetailsItem = new SuccessScreenDetailsItem(context);
        successScreenDetailsItem.addKey(str, DETAILS_TEXT_COLOR);
        successScreenDetailsItem.addValueWithSymbol(str2, DETAILS_SYMBOL_BACKGROUND_COLOR, DETAILS_SYMBOL_TEXT_COLOR);
        LinearLayout linearLayout = this.binding.f68997g;
        if (linearLayout != null) {
            linearLayout.addView(successScreenDetailsItem);
        }
    }

    public final void addHeader(String str) {
        C41536l.m120489i(str, "text");
        addHeader(str, HEADER_TEXT_COLOR, 15.0f);
    }

    public final void hideBottomDivider() {
        this.binding.f68996f.setVisibility(8);
    }

    public final void setIcon(int i) {
        ImageView imageView = this.binding.f68999i;
        if (imageView != null) {
            imageView.setImageResource(i);
        }
        invalidate();
    }

    public final void setTitle(String str, int i) {
        C41536l.m120489i(str, "title");
        TextView textView = this.binding.f69000j;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.binding.f69000j;
        if (textView2 != null) {
            Context context = getContext();
            C41536l.m120488h(context, "context");
            textView2.setTextColor(C32343x.m95418U(i, context));
        }
        TextView textView3 = this.binding.f69000j;
        if (textView3 != null) {
            textView3.setTypeface(C0808h.m3033h(getContext(), C10321j.f28707e));
        }
        invalidate();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuccessScreenView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C41536l.m120489i(context, "context");
        C27331i7 d = C27331i7.m84634d(LayoutInflater.from(getContext()), this, true);
        C41536l.m120488h(d, "inflate(LayoutInflater.from(context), this, true)");
        this.binding = d;
    }

    public final void addDetailsItem(String str, String str2) {
        C41536l.m120489i(str, "key");
        C41536l.m120489i(str2, C11755a.C11756a.f34100b);
        addDetailsItem$default(this, str, str2, (Integer) null, 0, Utils.FLOAT_EPSILON, 0, (Integer) null, (Integer) null, (Image) null, 508, (Object) null);
    }

    public final void addHeader(String str, int i, float f) {
        C41536l.m120489i(str, "text");
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setPadding(0, C32296c1.m95141a(getContext(), 15), 0, 0);
        textView.setTextSize(2, f);
        Context context = getContext();
        C41536l.m120488h(context, "context");
        textView.setTextColor(C32343x.m95418U(i, context));
        textView.setTypeface(C0808h.m3033h(getContext(), C10321j.bog_headline_light));
        LinearLayout linearLayout = this.binding.f68997g;
        if (linearLayout != null) {
            linearLayout.addView(textView);
        }
    }

    public final void addDetailsItem(String str, String str2, Integer num) {
        C41536l.m120489i(str, "key");
        C41536l.m120489i(str2, C11755a.C11756a.f34100b);
        addDetailsItem$default(this, str, str2, num, 0, Utils.FLOAT_EPSILON, 0, (Integer) null, (Integer) null, (Image) null, 504, (Object) null);
    }

    public final void addDetailsItem(String str, String str2, Integer num, int i) {
        C41536l.m120489i(str, "key");
        C41536l.m120489i(str2, C11755a.C11756a.f34100b);
        addDetailsItem$default(this, str, str2, num, i, Utils.FLOAT_EPSILON, 0, (Integer) null, (Integer) null, (Image) null, 496, (Object) null);
    }

    public final void addDetailsItem(String str, String str2, Integer num, int i, float f) {
        C41536l.m120489i(str, "key");
        C41536l.m120489i(str2, C11755a.C11756a.f34100b);
        addDetailsItem$default(this, str, str2, num, i, f, 0, (Integer) null, (Integer) null, (Image) null, 480, (Object) null);
    }

    public final void addDetailsItem(String str, String str2, Integer num, int i, float f, int i2) {
        C41536l.m120489i(str, "key");
        C41536l.m120489i(str2, C11755a.C11756a.f34100b);
        addDetailsItem$default(this, str, str2, num, i, f, i2, (Integer) null, (Integer) null, (Image) null, 448, (Object) null);
    }

    public final void addDetailsItem(String str, String str2, Integer num, int i, float f, int i2, Integer num2) {
        C41536l.m120489i(str, "key");
        C41536l.m120489i(str2, C11755a.C11756a.f34100b);
        addDetailsItem$default(this, str, str2, num, i, f, i2, num2, (Integer) null, (Image) null, 384, (Object) null);
    }

    public final void addDetailsItem(String str, String str2, Integer num, int i, float f, int i2, Integer num2, Integer num3) {
        C41536l.m120489i(str, "key");
        C41536l.m120489i(str2, C11755a.C11756a.f34100b);
        addDetailsItem$default(this, str, str2, num, i, f, i2, num2, num3, (Image) null, C11398b.f33139r, (Object) null);
    }

    public final void addDetailsItem(String str, String str2, Integer num, int i, float f, int i2, Integer num2, Integer num3, Image image) {
        Image.Resource resource;
        String str3 = str;
        C41536l.m120489i(str, "key");
        String str4 = str2;
        C41536l.m120489i(str2, C11755a.C11756a.f34100b);
        Context context = getContext();
        C41536l.m120488h(context, "context");
        SuccessScreenDetailsItem successScreenDetailsItem = new SuccessScreenDetailsItem(context);
        successScreenDetailsItem.addKey(str, DETAILS_TEXT_COLOR);
        if (image == null) {
            Image.Resource resource2 = null;
            if (num != null) {
                resource2 = new Image.Resource(num.intValue(), (Boolean) null, 2, (DefaultConstructorMarker) null);
            }
            resource = resource2;
        } else {
            resource = image;
        }
        successScreenDetailsItem.addValue(str2, resource, i, f, i2, num2, num3);
        LinearLayout linearLayout = this.binding.f68997g;
        if (linearLayout != null) {
            linearLayout.addView(successScreenDetailsItem);
        }
    }
}
