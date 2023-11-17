package com.salesforce.marketingcloud.messages.iam;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.salesforce.marketingcloud.C11302R;
import com.salesforce.marketingcloud.internal.C11493a;
import com.salesforce.marketingcloud.media.C11580o;
import com.salesforce.marketingcloud.media.C11590t;
import com.salesforce.marketingcloud.messages.iam.InAppMessage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.salesforce.marketingcloud.messages.iam.d */
abstract class C11639d {

    /* renamed from: a */
    private final View.OnClickListener f33748a;

    /* renamed from: b */
    private final Typeface f33749b;

    /* renamed from: com.salesforce.marketingcloud.messages.iam.d$a */
    class C11640a implements Comparator<InAppMessage.Button> {
        C11640a() {
        }

        /* renamed from: a */
        public int compare(InAppMessage.Button button, InAppMessage.Button button2) {
            return button.index() - button2.index();
        }
    }

    /* renamed from: com.salesforce.marketingcloud.messages.iam.d$b */
    class C11641b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f33751a;

        /* renamed from: b */
        final /* synthetic */ int f33752b;

        /* renamed from: c */
        final /* synthetic */ View f33753c;

        C11641b(View view, int i, View view2) {
            this.f33751a = view;
            this.f33752b = i;
            this.f33753c = view2;
        }

        public void run() {
            Rect rect = new Rect();
            this.f33751a.getHitRect(rect);
            int i = rect.top;
            int i2 = this.f33752b;
            rect.top = i - i2;
            rect.left -= i2;
            rect.bottom += i2;
            rect.right += i2;
            this.f33753c.setTouchDelegate(new TouchDelegate(rect, this.f33751a));
        }
    }

    /* renamed from: com.salesforce.marketingcloud.messages.iam.d$c */
    static /* synthetic */ class C11642c {

        /* renamed from: a */
        static final /* synthetic */ int[] f33755a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.salesforce.marketingcloud.messages.iam.InAppMessage$Size[] r0 = com.salesforce.marketingcloud.messages.iam.InAppMessage.Size.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f33755a = r0
                com.salesforce.marketingcloud.messages.iam.InAppMessage$Size r1 = com.salesforce.marketingcloud.messages.iam.InAppMessage.Size.l     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f33755a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.salesforce.marketingcloud.messages.iam.InAppMessage$Size r1 = com.salesforce.marketingcloud.messages.iam.InAppMessage.Size.m     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f33755a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.salesforce.marketingcloud.messages.iam.InAppMessage$Size r1 = com.salesforce.marketingcloud.messages.iam.InAppMessage.Size.s     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.messages.iam.C11639d.C11642c.<clinit>():void");
        }
    }

    C11639d(View.OnClickListener onClickListener, Typeface typeface) {
        this.f33748a = onClickListener;
        this.f33749b = typeface;
    }

    /* renamed from: a */
    private float m42458a(Context context, InAppMessage.Size size) {
        if (size == null) {
            size = InAppMessage.Size.s;
        }
        Resources resources = context.getResources();
        int i = C11642c.f33755a[size.ordinal()];
        return resources.getDimension(i != 1 ? i != 2 ? C11302R.dimen.mcsdk_border_width_small : C11302R.dimen.mcsdk_border_width_medium : C11302R.dimen.mcsdk_border_width_large);
    }

    /* renamed from: b */
    private float m42466b(Context context, InAppMessage.Size size) {
        if (size == null) {
            size = InAppMessage.Size.s;
        }
        Resources resources = context.getResources();
        int i = C11642c.f33755a[size.ordinal()];
        return resources.getDimension(i != 1 ? i != 2 ? C11302R.dimen.mcsdk_corner_radius_small : C11302R.dimen.mcsdk_corner_radius_medium : C11302R.dimen.mcsdk_corner_radius_large);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract float mo30672a(Resources resources);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract float mo30673a(Resources resources, InAppMessage.Size size);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo30674a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract float mo30677b(Resources resources);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract float mo30678b(Resources resources, InAppMessage.Size size);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo30679b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract float mo30681c(Resources resources);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract float mo30682c(Resources resources, InAppMessage.Size size);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo30683c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int mo30684d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract int mo30685e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract int mo30686f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract int mo30687g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract int mo30688h();

    /* renamed from: a */
    private void m42459a(View view) {
        if (view != null) {
            View view2 = (View) view.getParent();
            view2.post(new C11641b(view, Math.round(mo30672a(view.getContext().getResources())), view2));
        }
    }

    /* renamed from: b */
    private void m42467b(View view, InAppMessage.TextField textField) {
        TextView textView = (TextView) view.findViewById(mo30688h());
        if (textView != null) {
            if (m42464a(textField)) {
                textView.setVisibility(0);
                Typeface typeface = this.f33749b;
                if (typeface != null) {
                    textView.setTypeface(typeface, 1);
                }
                C11647g.m42518a(textView, textField.text(), C11647g.m42515a(view.getContext(), textField.fontColor(), C11302R.color.mcsdk_iam_default_font_color), mo30682c(view.getContext().getResources(), textField.fontSize()), C11647g.m42516a(textField.alignment()));
                return;
            }
            textView.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m42460a(View view, C11580o oVar, InAppMessage.Media media, InAppMessage.Type type) {
        ImageView imageView = (ImageView) view.findViewById(mo30685e());
        if (imageView != null) {
            Context context = view.getContext();
            if (media == null) {
                View findViewById = view.findViewById(mo30684d());
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                } else {
                    imageView.setVisibility(8);
                }
            } else if (oVar != null) {
                imageView.setVisibility(0);
                C11590t d = oVar.mo30239b(media.url()).mo30268d();
                if (type == InAppMessage.Type.fullImageFill) {
                    d.mo30266b();
                } else {
                    d.mo30258a();
                }
                d.mo30259a(m42466b(context, media.cornerRadius()), m42458a(context, media.borderWidth()), C11647g.m42515a(context, media.borderColor(), C11302R.color.mcsdk_iam_default_border)).mo30263a(imageView);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo30680b(View view, C11654k kVar) {
    }

    /* renamed from: b */
    private void m42468b(ViewGroup viewGroup) {
        Space space = new Space(viewGroup.getContext());
        space.setLayoutParams(new LinearLayout.LayoutParams(-1, Math.round(mo30681c(viewGroup.getResources()))));
        viewGroup.addView(space);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo30675a(View view, InAppMessage.ButtonConfig buttonConfig, List<InAppMessage.Button> list) {
        int i;
        InAppMessage.ButtonConfig buttonConfig2 = buttonConfig;
        Context context = view.getContext();
        LinearLayout linearLayout = (LinearLayout) view.findViewById(mo30679b());
        boolean z = false;
        if (buttonConfig2 == InAppMessage.ButtonConfig.stacked) {
            linearLayout.setOrientation(1);
            i = C11302R.layout.mcsdk_iam_stacked_button;
        } else {
            linearLayout.setOrientation(0);
            i = C11302R.layout.mcsdk_iam_sbs_button;
        }
        LayoutInflater from = LayoutInflater.from(context);
        int size = list.size();
        int i2 = 0;
        while (i2 < 2 && i2 < size) {
            InAppMessage.Button button = list.get(i2);
            Button button2 = (Button) from.inflate(i, linearLayout, z);
            Typeface typeface = this.f33749b;
            if (typeface != null) {
                button2.setTypeface(typeface, z ? 1 : 0);
            }
            C11647g.m42518a(button2, button.text(), C11647g.m42515a(context, button.fontColor(), C11302R.color.mcsdk_iam_default_font_color), mo30678b(context.getResources(), button.fontSize()), C11647g.m42516a(InAppMessage.Alignment.center));
            ViewCompat.m3627v0(button2, C11647g.m42517a(C11647g.m42515a(context, button.backgroundColor(), C11302R.color.mcsdk_iam_default_btn_background), m42466b(context, button.cornerRadius()), C11647g.m42515a(context, button.borderColor(), C11302R.color.mcsdk_iam_default_border), m42458a(context, button.borderWidth())));
            button2.setTag(button);
            button2.setOnClickListener(this.f33748a);
            linearLayout.addView(button2);
            if (i2 == 0 && size > 1) {
                if (buttonConfig2 == InAppMessage.ButtonConfig.stacked) {
                    m42468b((ViewGroup) linearLayout);
                } else {
                    m42463a((ViewGroup) linearLayout);
                }
            }
            i2++;
            z = false;
        }
    }

    /* renamed from: a */
    private void m42461a(View view, InAppMessage.CloseButton closeButton) {
        ImageButton imageButton = (ImageButton) view.findViewById(mo30683c());
        if (imageButton != null) {
            if (closeButton != null) {
                ViewCompat.m3568O0(imageButton, 1.0f);
                imageButton.setVisibility(0);
                imageButton.setTag(closeButton);
                imageButton.setOnClickListener(this.f33748a);
                m42459a((View) imageButton);
                return;
            }
            imageButton.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m42462a(View view, InAppMessage.TextField textField) {
        TextView textView = (TextView) view.findViewById(mo30674a());
        if (textView != null) {
            if (m42464a(textField)) {
                textView.setVisibility(0);
                Typeface typeface = this.f33749b;
                if (typeface != null) {
                    textView.setTypeface(typeface, 0);
                }
                C11647g.m42518a(textView, textField.text(), C11647g.m42515a(view.getContext(), textField.fontColor(), C11302R.color.mcsdk_iam_default_font_color), mo30673a(view.getContext().getResources(), textField.fontSize()), C11647g.m42516a(textField.alignment()));
                return;
            }
            textView.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo30692a(View view, C11654k kVar) {
        if (kVar != null && view != null) {
            InAppMessage d = kVar.mo30716d();
            mo30676a(view, d.windowColor());
            mo30693a(view, d.backgroundColor(), d.borderColor(), d.borderWidth(), d.cornerRadius());
            m42467b(view, d.title());
            m42462a(view, d.body());
            m42461a(view, m42465a(d) ? d.closeButton() : C11493a.m42002a());
            List<InAppMessage.Button> buttons = d.buttons();
            if (buttons == null || buttons.isEmpty()) {
                View findViewById = view.findViewById(mo30679b());
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
            } else {
                ArrayList arrayList = new ArrayList(buttons);
                Collections.sort(arrayList, new C11640a());
                mo30675a(view, d.buttonConfiguration(), arrayList);
            }
            m42460a(view, kVar.mo30718e(), d.media(), d.type());
            mo30680b(view, kVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo30676a(View view, String str) {
        View findViewById = view.findViewById(mo30687g());
        if (findViewById != null) {
            findViewById.setBackgroundColor(C11647g.m42515a(view.getContext(), str, C11302R.color.mcsdk_iam_default_window_background));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo30693a(View view, String str, String str2, InAppMessage.Size size, InAppMessage.Size size2) {
        View findViewById = view.findViewById(mo30686f());
        if (findViewById != null) {
            Context context = view.getContext();
            float b = m42466b(context, size2);
            float a = m42458a(context, size);
            ViewCompat.m3627v0(findViewById, C11647g.m42517a(C11647g.m42515a(context, str, C11302R.color.mcsdk_iam_default_message_background), b, C11647g.m42515a(context, str2, C11302R.color.mcsdk_iam_default_border), a));
            if (findViewById instanceof ClippingConstraintLayout) {
                ((ClippingConstraintLayout) findViewById).setClippingDetails(a, b);
            }
        }
    }

    /* renamed from: a */
    private void m42463a(ViewGroup viewGroup) {
        Space space = new Space(viewGroup.getContext());
        space.setLayoutParams(new LinearLayout.LayoutParams(Math.round(mo30677b(viewGroup.getResources())), -1));
        viewGroup.addView(space);
    }

    /* renamed from: a */
    static boolean m42464a(InAppMessage.TextField textField) {
        return textField != null && !TextUtils.isEmpty(textField.text());
    }

    /* renamed from: a */
    static boolean m42465a(InAppMessage inAppMessage) {
        return ((inAppMessage.type() == InAppMessage.Type.full || inAppMessage.type() == InAppMessage.Type.modal) && inAppMessage.closeButton() == null && (inAppMessage.buttons() == null || inAppMessage.buttons().isEmpty())) ? false : true;
    }
}
