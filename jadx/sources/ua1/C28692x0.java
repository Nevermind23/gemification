package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import ba1.C10216u;
import ba1.C10217v;
import com.facebook.shimmer.ShimmerFrameLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.digitalkeyboard.NumericKeyboardView;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.designsystem.components.passcode.PasscodeCompactView;

/* renamed from: ua1.x0 */
public final class C28692x0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f73037d;

    /* renamed from: e */
    public final ActionSheetTitle f73038e;

    /* renamed from: f */
    public final LinearLayout f73039f;

    /* renamed from: g */
    public final PageDescriptionView f73040g;

    /* renamed from: h */
    public final ShimmerFrameLayout f73041h;

    /* renamed from: i */
    public final Button f73042i;

    /* renamed from: j */
    public final LayerView f73043j;

    /* renamed from: k */
    public final LinearLayout f73044k;

    /* renamed from: l */
    public final NumericKeyboardView f73045l;

    /* renamed from: m */
    public final ShimmerFrameLayout f73046m;

    /* renamed from: n */
    public final PasscodeCompactView f73047n;

    /* renamed from: o */
    public final Button f73048o;

    /* renamed from: p */
    public final Button f73049p;

    /* renamed from: q */
    public final PageDescriptionView f73050q;

    private C28692x0(ConstraintLayout constraintLayout, ActionSheetTitle actionSheetTitle, LinearLayout linearLayout, PageDescriptionView pageDescriptionView, ShimmerFrameLayout shimmerFrameLayout, Button button, LayerView layerView, LinearLayout linearLayout2, NumericKeyboardView numericKeyboardView, ShimmerFrameLayout shimmerFrameLayout2, PasscodeCompactView passcodeCompactView, Button button2, Button button3, PageDescriptionView pageDescriptionView2) {
        this.f73037d = constraintLayout;
        this.f73038e = actionSheetTitle;
        this.f73039f = linearLayout;
        this.f73040g = pageDescriptionView;
        this.f73041h = shimmerFrameLayout;
        this.f73042i = button;
        this.f73043j = layerView;
        this.f73044k = linearLayout2;
        this.f73045l = numericKeyboardView;
        this.f73046m = shimmerFrameLayout2;
        this.f73047n = passcodeCompactView;
        this.f73048o = button2;
        this.f73049p = button3;
        this.f73050q = pageDescriptionView2;
    }

    /* renamed from: a */
    public static C28692x0 m87886a(View view) {
        View view2 = view;
        int i = C10216u.f28317b;
        ActionSheetTitle actionSheetTitle = (ActionSheetTitle) C6202b.m24689a(view2, i);
        if (actionSheetTitle != null) {
            i = C10216u.biometric_auth_layout;
            LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view2, i);
            if (linearLayout != null) {
                i = C10216u.biometry_page_description;
                PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view2, i);
                if (pageDescriptionView != null) {
                    i = C10216u.biometry_shimmer;
                    ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C6202b.m24689a(view2, i);
                    if (shimmerFrameLayout != null) {
                        i = C10216u.f28310W;
                        Button button = (Button) C6202b.m24689a(view2, i);
                        if (button != null) {
                            i = C10216u.f28328h1;
                            LayerView layerView = (LayerView) C6202b.m24689a(view2, i);
                            if (layerView != null) {
                                i = C10216u.passcode_auth_layout;
                                LinearLayout linearLayout2 = (LinearLayout) C6202b.m24689a(view2, i);
                                if (linearLayout2 != null) {
                                    i = C10216u.passcode_keyboard_view;
                                    NumericKeyboardView numericKeyboardView = (NumericKeyboardView) C6202b.m24689a(view2, i);
                                    if (numericKeyboardView != null) {
                                        i = C10216u.passcode_shimmer;
                                        ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) C6202b.m24689a(view2, i);
                                        if (shimmerFrameLayout2 != null) {
                                            i = C10216u.passcode_view;
                                            PasscodeCompactView passcodeCompactView = (PasscodeCompactView) C6202b.m24689a(view2, i);
                                            if (passcodeCompactView != null) {
                                                i = C10216u.retry_bio_auth_button;
                                                Button button2 = (Button) C6202b.m24689a(view2, i);
                                                if (button2 != null) {
                                                    i = C10216u.skip_bio_auth_button;
                                                    Button button3 = (Button) C6202b.m24689a(view2, i);
                                                    if (button3 != null) {
                                                        i = C10216u.skip_bio_auth_page_description;
                                                        PageDescriptionView pageDescriptionView2 = (PageDescriptionView) C6202b.m24689a(view2, i);
                                                        if (pageDescriptionView2 != null) {
                                                            return new C28692x0((ConstraintLayout) view2, actionSheetTitle, linearLayout, pageDescriptionView, shimmerFrameLayout, button, layerView, linearLayout2, numericKeyboardView, shimmerFrameLayout2, passcodeCompactView, button2, button3, pageDescriptionView2);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28692x0 m87887d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.fragment_single_component_auth_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87886a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f73037d;
    }
}
