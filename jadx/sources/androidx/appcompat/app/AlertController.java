package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import com.github.mikephil.charting.utils.Utils;
import java.lang.ref.WeakReference;
import p030c.C2210a;
import p030c.C2215f;
import p030c.C2219j;

class AlertController {

    /* renamed from: A */
    NestedScrollView f1076A;

    /* renamed from: B */
    private int f1077B = 0;

    /* renamed from: C */
    private Drawable f1078C;

    /* renamed from: D */
    private ImageView f1079D;

    /* renamed from: E */
    private TextView f1080E;

    /* renamed from: F */
    private TextView f1081F;

    /* renamed from: G */
    private View f1082G;

    /* renamed from: H */
    ListAdapter f1083H;

    /* renamed from: I */
    int f1084I = -1;

    /* renamed from: J */
    private int f1085J;

    /* renamed from: K */
    private int f1086K;

    /* renamed from: L */
    int f1087L;

    /* renamed from: M */
    int f1088M;

    /* renamed from: N */
    int f1089N;

    /* renamed from: O */
    int f1090O;

    /* renamed from: P */
    private boolean f1091P;

    /* renamed from: Q */
    private int f1092Q = 0;

    /* renamed from: R */
    Handler f1093R;

    /* renamed from: S */
    private final View.OnClickListener f1094S = new C0176a();

    /* renamed from: a */
    private final Context f1095a;

    /* renamed from: b */
    final C0253u f1096b;

    /* renamed from: c */
    private final Window f1097c;

    /* renamed from: d */
    private final int f1098d;

    /* renamed from: e */
    private CharSequence f1099e;

    /* renamed from: f */
    private CharSequence f1100f;

    /* renamed from: g */
    ListView f1101g;

    /* renamed from: h */
    private View f1102h;

    /* renamed from: i */
    private int f1103i;

    /* renamed from: j */
    private int f1104j;

    /* renamed from: k */
    private int f1105k;

    /* renamed from: l */
    private int f1106l;

    /* renamed from: m */
    private int f1107m;

    /* renamed from: n */
    private boolean f1108n = false;

    /* renamed from: o */
    Button f1109o;

    /* renamed from: p */
    private CharSequence f1110p;

    /* renamed from: q */
    Message f1111q;

    /* renamed from: r */
    private Drawable f1112r;

    /* renamed from: s */
    Button f1113s;

    /* renamed from: t */
    private CharSequence f1114t;

    /* renamed from: u */
    Message f1115u;

    /* renamed from: v */
    private Drawable f1116v;

    /* renamed from: w */
    Button f1117w;

    /* renamed from: x */
    private CharSequence f1118x;

    /* renamed from: y */
    Message f1119y;

    /* renamed from: z */
    private Drawable f1120z;

    public static class RecycleListView extends ListView {

        /* renamed from: d */
        private final int f1121d;

        /* renamed from: e */
        private final int f1122e;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2219j.f6803k2);
            this.f1122e = obtainStyledAttributes.getDimensionPixelOffset(C2219j.f6808l2, -1);
            this.f1121d = obtainStyledAttributes.getDimensionPixelOffset(C2219j.f6813m2, -1);
        }

        /* renamed from: a */
        public void mo420a(boolean z, boolean z2) {
            int i;
            int i2;
            if (!z2 || !z) {
                int paddingLeft = getPaddingLeft();
                if (z) {
                    i = getPaddingTop();
                } else {
                    i = this.f1121d;
                }
                int paddingRight = getPaddingRight();
                if (z2) {
                    i2 = getPaddingBottom();
                } else {
                    i2 = this.f1122e;
                }
                setPadding(paddingLeft, i, paddingRight, i2);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    class C0176a implements View.OnClickListener {
        C0176a() {
        }

        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            Message message4;
            AlertController alertController = AlertController.this;
            if (view == alertController.f1109o && (message4 = alertController.f1111q) != null) {
                message = Message.obtain(message4);
            } else if (view == alertController.f1113s && (message3 = alertController.f1115u) != null) {
                message = Message.obtain(message3);
            } else if (view != alertController.f1117w || (message2 = alertController.f1119y) == null) {
                message = null;
            } else {
                message = Message.obtain(message2);
            }
            if (message != null) {
                message.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f1093R.obtainMessage(1, alertController2.f1096b).sendToTarget();
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    public static class C0177b {

        /* renamed from: A */
        public int f1124A;

        /* renamed from: B */
        public int f1125B;

        /* renamed from: C */
        public int f1126C;

        /* renamed from: D */
        public int f1127D;

        /* renamed from: E */
        public boolean f1128E = false;

        /* renamed from: F */
        public boolean[] f1129F;

        /* renamed from: G */
        public boolean f1130G;

        /* renamed from: H */
        public boolean f1131H;

        /* renamed from: I */
        public int f1132I = -1;

        /* renamed from: J */
        public DialogInterface.OnMultiChoiceClickListener f1133J;

        /* renamed from: K */
        public Cursor f1134K;

        /* renamed from: L */
        public String f1135L;

        /* renamed from: M */
        public String f1136M;

        /* renamed from: N */
        public boolean f1137N;

        /* renamed from: O */
        public AdapterView.OnItemSelectedListener f1138O;

        /* renamed from: P */
        public boolean f1139P = true;

        /* renamed from: a */
        public final Context f1140a;

        /* renamed from: b */
        public final LayoutInflater f1141b;

        /* renamed from: c */
        public int f1142c = 0;

        /* renamed from: d */
        public Drawable f1143d;

        /* renamed from: e */
        public int f1144e = 0;

        /* renamed from: f */
        public CharSequence f1145f;

        /* renamed from: g */
        public View f1146g;

        /* renamed from: h */
        public CharSequence f1147h;

        /* renamed from: i */
        public CharSequence f1148i;

        /* renamed from: j */
        public Drawable f1149j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f1150k;

        /* renamed from: l */
        public CharSequence f1151l;

        /* renamed from: m */
        public Drawable f1152m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f1153n;

        /* renamed from: o */
        public CharSequence f1154o;

        /* renamed from: p */
        public Drawable f1155p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f1156q;

        /* renamed from: r */
        public boolean f1157r;

        /* renamed from: s */
        public DialogInterface.OnCancelListener f1158s;

        /* renamed from: t */
        public DialogInterface.OnDismissListener f1159t;

        /* renamed from: u */
        public DialogInterface.OnKeyListener f1160u;

        /* renamed from: v */
        public CharSequence[] f1161v;

        /* renamed from: w */
        public ListAdapter f1162w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f1163x;

        /* renamed from: y */
        public int f1164y;

        /* renamed from: z */
        public View f1165z;

        /* renamed from: androidx.appcompat.app.AlertController$b$a */
        class C0178a extends ArrayAdapter {

            /* renamed from: d */
            final /* synthetic */ RecycleListView f1166d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0178a(Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i, i2, charSequenceArr);
                this.f1166d = recycleListView;
            }

            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = C0177b.this.f1129F;
                if (zArr != null && zArr[i]) {
                    this.f1166d.setItemChecked(i, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$b$b */
        class C0179b extends CursorAdapter {

            /* renamed from: d */
            private final int f1168d;

            /* renamed from: e */
            private final int f1169e;

            /* renamed from: f */
            final /* synthetic */ RecycleListView f1170f;

            /* renamed from: g */
            final /* synthetic */ AlertController f1171g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0179b(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z);
                this.f1170f = recycleListView;
                this.f1171g = alertController;
                Cursor cursor2 = getCursor();
                this.f1168d = cursor2.getColumnIndexOrThrow(C0177b.this.f1135L);
                this.f1169e = cursor2.getColumnIndexOrThrow(C0177b.this.f1136M);
            }

            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f1168d));
                RecycleListView recycleListView = this.f1170f;
                int position = cursor.getPosition();
                boolean z = true;
                if (cursor.getInt(this.f1169e) != 1) {
                    z = false;
                }
                recycleListView.setItemChecked(position, z);
            }

            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C0177b.this.f1141b.inflate(this.f1171g.f1088M, viewGroup, false);
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$b$c */
        class C0180c implements AdapterView.OnItemClickListener {

            /* renamed from: d */
            final /* synthetic */ AlertController f1173d;

            C0180c(AlertController alertController) {
                this.f1173d = alertController;
            }

            public void onItemClick(AdapterView adapterView, View view, int i, long j) {
                C0177b.this.f1163x.onClick(this.f1173d.f1096b, i);
                if (!C0177b.this.f1131H) {
                    this.f1173d.f1096b.dismiss();
                }
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$b$d */
        class C0181d implements AdapterView.OnItemClickListener {

            /* renamed from: d */
            final /* synthetic */ RecycleListView f1175d;

            /* renamed from: e */
            final /* synthetic */ AlertController f1176e;

            C0181d(RecycleListView recycleListView, AlertController alertController) {
                this.f1175d = recycleListView;
                this.f1176e = alertController;
            }

            public void onItemClick(AdapterView adapterView, View view, int i, long j) {
                boolean[] zArr = C0177b.this.f1129F;
                if (zArr != null) {
                    zArr[i] = this.f1175d.isItemChecked(i);
                }
                C0177b.this.f1133J.onClick(this.f1176e.f1096b, i, this.f1175d.isItemChecked(i));
            }
        }

        public C0177b(Context context) {
            this.f1140a = context;
            this.f1157r = true;
            this.f1141b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARNING: type inference failed for: r9v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r9v3 */
        /* JADX WARNING: type inference failed for: r9v4 */
        /* JADX WARNING: type inference failed for: r2v5, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v22, types: [androidx.appcompat.app.AlertController$b$b] */
        /* JADX WARNING: type inference failed for: r1v23, types: [androidx.appcompat.app.AlertController$b$a] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m487b(androidx.appcompat.app.AlertController r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.f1141b
                int r1 = r11.f1087L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r10.f1130G
                r8 = 1
                if (r1 == 0) goto L_0x0035
                android.database.Cursor r1 = r10.f1134K
                if (r1 != 0) goto L_0x0026
                androidx.appcompat.app.AlertController$b$a r9 = new androidx.appcompat.app.AlertController$b$a
                android.content.Context r3 = r10.f1140a
                int r4 = r11.f1088M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r10.f1161v
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x0026:
                androidx.appcompat.app.AlertController$b$b r9 = new androidx.appcompat.app.AlertController$b$b
                android.content.Context r3 = r10.f1140a
                android.database.Cursor r4 = r10.f1134K
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x0035:
                boolean r1 = r10.f1131H
                if (r1 == 0) goto L_0x003c
                int r1 = r11.f1089N
                goto L_0x003e
            L_0x003c:
                int r1 = r11.f1090O
            L_0x003e:
                r4 = r1
                android.database.Cursor r1 = r10.f1134K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L_0x005d
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f1140a
                android.database.Cursor r5 = r10.f1134K
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r1 = r10.f1135L
                r7 = 0
                r6[r7] = r1
                int[] r1 = new int[r8]
                r1[r7] = r2
                r2 = r9
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x005d:
                android.widget.ListAdapter r9 = r10.f1162w
                if (r9 == 0) goto L_0x0062
                goto L_0x006b
            L_0x0062:
                androidx.appcompat.app.AlertController$d r9 = new androidx.appcompat.app.AlertController$d
                android.content.Context r1 = r10.f1140a
                java.lang.CharSequence[] r3 = r10.f1161v
                r9.<init>(r1, r4, r2, r3)
            L_0x006b:
                r11.f1083H = r9
                int r1 = r10.f1132I
                r11.f1084I = r1
                android.content.DialogInterface$OnClickListener r1 = r10.f1163x
                if (r1 == 0) goto L_0x007e
                androidx.appcompat.app.AlertController$b$c r1 = new androidx.appcompat.app.AlertController$b$c
                r1.<init>(r11)
                r0.setOnItemClickListener(r1)
                goto L_0x008a
            L_0x007e:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.f1133J
                if (r1 == 0) goto L_0x008a
                androidx.appcompat.app.AlertController$b$d r1 = new androidx.appcompat.app.AlertController$b$d
                r1.<init>(r0, r11)
                r0.setOnItemClickListener(r1)
            L_0x008a:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.f1138O
                if (r1 == 0) goto L_0x0091
                r0.setOnItemSelectedListener(r1)
            L_0x0091:
                boolean r1 = r10.f1131H
                if (r1 == 0) goto L_0x0099
                r0.setChoiceMode(r8)
                goto L_0x00a1
            L_0x0099:
                boolean r1 = r10.f1130G
                if (r1 == 0) goto L_0x00a1
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00a1:
                r11.f1101g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0177b.m487b(androidx.appcompat.app.AlertController):void");
        }

        /* renamed from: a */
        public void mo422a(AlertController alertController) {
            View view = this.f1146g;
            if (view != null) {
                alertController.mo412l(view);
            } else {
                CharSequence charSequence = this.f1145f;
                if (charSequence != null) {
                    alertController.mo416q(charSequence);
                }
                Drawable drawable = this.f1143d;
                if (drawable != null) {
                    alertController.mo414n(drawable);
                }
                int i = this.f1142c;
                if (i != 0) {
                    alertController.mo413m(i);
                }
                int i2 = this.f1144e;
                if (i2 != 0) {
                    alertController.mo413m(alertController.mo406d(i2));
                }
            }
            CharSequence charSequence2 = this.f1147h;
            if (charSequence2 != null) {
                alertController.mo415o(charSequence2);
            }
            CharSequence charSequence3 = this.f1148i;
            if (!(charSequence3 == null && this.f1149j == null)) {
                alertController.mo411k(-1, charSequence3, this.f1150k, (Message) null, this.f1149j);
            }
            CharSequence charSequence4 = this.f1151l;
            if (!(charSequence4 == null && this.f1152m == null)) {
                alertController.mo411k(-2, charSequence4, this.f1153n, (Message) null, this.f1152m);
            }
            CharSequence charSequence5 = this.f1154o;
            if (!(charSequence5 == null && this.f1155p == null)) {
                alertController.mo411k(-3, charSequence5, this.f1156q, (Message) null, this.f1155p);
            }
            if (!(this.f1161v == null && this.f1134K == null && this.f1162w == null)) {
                m487b(alertController);
            }
            View view2 = this.f1165z;
            if (view2 == null) {
                int i3 = this.f1164y;
                if (i3 != 0) {
                    alertController.mo417r(i3);
                }
            } else if (this.f1128E) {
                alertController.mo419t(view2, this.f1124A, this.f1125B, this.f1126C, this.f1127D);
            } else {
                alertController.mo418s(view2);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$c */
    private static final class C0182c extends Handler {

        /* renamed from: a */
        private WeakReference f1178a;

        public C0182c(DialogInterface dialogInterface) {
            this.f1178a = new WeakReference(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f1178a.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$d */
    private static class C0183d extends ArrayAdapter {
        public C0183d(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, C0253u uVar, Window window) {
        this.f1095a = context;
        this.f1096b = uVar;
        this.f1097c = window;
        this.f1093R = new C0182c(uVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C2219j.f6645F, C2210a.f6455k, 0);
        this.f1085J = obtainStyledAttributes.getResourceId(C2219j.f6650G, 0);
        this.f1086K = obtainStyledAttributes.getResourceId(C2219j.f6660I, 0);
        this.f1087L = obtainStyledAttributes.getResourceId(C2219j.f6670K, 0);
        this.f1088M = obtainStyledAttributes.getResourceId(C2219j.f6675L, 0);
        this.f1089N = obtainStyledAttributes.getResourceId(C2219j.f6685N, 0);
        this.f1090O = obtainStyledAttributes.getResourceId(C2219j.f6665J, 0);
        this.f1091P = obtainStyledAttributes.getBoolean(C2219j.f6680M, true);
        this.f1098d = obtainStyledAttributes.getDimensionPixelSize(C2219j.f6655H, 0);
        obtainStyledAttributes.recycle();
        uVar.mo707h(1);
    }

    /* renamed from: a */
    static boolean m460a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m460a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m461b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: i */
    private ViewGroup m462i(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: j */
    private int m463j() {
        int i = this.f1086K;
        if (i == 0) {
            return this.f1085J;
        }
        if (this.f1092Q == 1) {
            return i;
        }
        return this.f1085J;
    }

    /* renamed from: p */
    private void m464p(ViewGroup viewGroup, View view, int i, int i2) {
        View findViewById = this.f1097c.findViewById(C2215f.f6575v);
        View findViewById2 = this.f1097c.findViewById(C2215f.f6574u);
        ViewCompat.m3558J0(view, i, i2);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        if (findViewById2 != null) {
            viewGroup.removeView(findViewById2);
        }
    }

    /* renamed from: u */
    private void m465u(ViewGroup viewGroup) {
        boolean z;
        Button button = (Button) viewGroup.findViewById(16908313);
        this.f1109o = button;
        button.setOnClickListener(this.f1094S);
        boolean z2 = true;
        if (!TextUtils.isEmpty(this.f1110p) || this.f1112r != null) {
            this.f1109o.setText(this.f1110p);
            Drawable drawable = this.f1112r;
            if (drawable != null) {
                int i = this.f1098d;
                drawable.setBounds(0, 0, i, i);
                this.f1109o.setCompoundDrawables(this.f1112r, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f1109o.setVisibility(0);
            z = true;
        } else {
            this.f1109o.setVisibility(8);
            z = false;
        }
        Button button2 = (Button) viewGroup.findViewById(16908314);
        this.f1113s = button2;
        button2.setOnClickListener(this.f1094S);
        if (!TextUtils.isEmpty(this.f1114t) || this.f1116v != null) {
            this.f1113s.setText(this.f1114t);
            Drawable drawable2 = this.f1116v;
            if (drawable2 != null) {
                int i2 = this.f1098d;
                drawable2.setBounds(0, 0, i2, i2);
                this.f1113s.setCompoundDrawables(this.f1116v, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f1113s.setVisibility(0);
            z |= true;
        } else {
            this.f1113s.setVisibility(8);
        }
        Button button3 = (Button) viewGroup.findViewById(16908315);
        this.f1117w = button3;
        button3.setOnClickListener(this.f1094S);
        if (!TextUtils.isEmpty(this.f1118x) || this.f1120z != null) {
            this.f1117w.setText(this.f1118x);
            Drawable drawable3 = this.f1120z;
            if (drawable3 != null) {
                int i3 = this.f1098d;
                drawable3.setBounds(0, 0, i3, i3);
                this.f1117w.setCompoundDrawables(this.f1120z, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f1117w.setVisibility(0);
            z |= true;
        } else {
            this.f1117w.setVisibility(8);
        }
        if (m470z(this.f1095a)) {
            if (z) {
                m461b(this.f1109o);
            } else if (z) {
                m461b(this.f1113s);
            } else if (z) {
                m461b(this.f1117w);
            }
        }
        if (!z) {
            z2 = false;
        }
        if (!z2) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: v */
    private void m466v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f1097c.findViewById(C2215f.f6576w);
        this.f1076A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f1076A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.f1081F = textView;
        if (textView != null) {
            CharSequence charSequence = this.f1100f;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.f1076A.removeView(this.f1081F);
            if (this.f1101g != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.f1076A.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.f1076A);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.f1101g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: w */
    private void m467w(ViewGroup viewGroup) {
        View view = this.f1102h;
        boolean z = false;
        if (view == null) {
            if (this.f1103i != 0) {
                view = LayoutInflater.from(this.f1095a).inflate(this.f1103i, viewGroup, false);
            } else {
                view = null;
            }
        }
        if (view != null) {
            z = true;
        }
        if (!z || !m460a(view)) {
            this.f1097c.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f1097c.findViewById(C2215f.f6567n);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f1108n) {
                frameLayout.setPadding(this.f1104j, this.f1105k, this.f1106l, this.f1107m);
            }
            if (this.f1101g != null) {
                ((LinearLayoutCompat.C0360a) viewGroup.getLayoutParams()).weight = Utils.FLOAT_EPSILON;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: x */
    private void m468x(ViewGroup viewGroup) {
        if (this.f1082G != null) {
            viewGroup.addView(this.f1082G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f1097c.findViewById(C2215f.f6552O).setVisibility(8);
            return;
        }
        this.f1079D = (ImageView) this.f1097c.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f1099e)) || !this.f1091P) {
            this.f1097c.findViewById(C2215f.f6552O).setVisibility(8);
            this.f1079D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f1097c.findViewById(C2215f.f6563j);
        this.f1080E = textView;
        textView.setText(this.f1099e);
        int i = this.f1077B;
        if (i != 0) {
            this.f1079D.setImageResource(i);
            return;
        }
        Drawable drawable = this.f1078C;
        if (drawable != null) {
            this.f1079D.setImageDrawable(drawable);
            return;
        }
        this.f1080E.setPadding(this.f1079D.getPaddingLeft(), this.f1079D.getPaddingTop(), this.f1079D.getPaddingRight(), this.f1079D.getPaddingBottom());
        this.f1079D.setVisibility(8);
    }

    /* renamed from: y */
    private void m469y() {
        boolean z;
        boolean z2;
        boolean z3;
        ListAdapter listAdapter;
        View findViewById;
        View view;
        View findViewById2;
        View findViewById3 = this.f1097c.findViewById(C2215f.f6573t);
        int i = C2215f.f6553P;
        View findViewById4 = findViewById3.findViewById(i);
        int i2 = C2215f.f6566m;
        View findViewById5 = findViewById3.findViewById(i2);
        int i3 = C2215f.f6564k;
        View findViewById6 = findViewById3.findViewById(i3);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(C2215f.f6568o);
        m467w(viewGroup);
        View findViewById7 = viewGroup.findViewById(i);
        View findViewById8 = viewGroup.findViewById(i2);
        View findViewById9 = viewGroup.findViewById(i3);
        ViewGroup i4 = m462i(findViewById7, findViewById4);
        ViewGroup i5 = m462i(findViewById8, findViewById5);
        ViewGroup i6 = m462i(findViewById9, findViewById6);
        m466v(i5);
        m465u(i6);
        m468x(i4);
        char c = 0;
        if (viewGroup.getVisibility() != 8) {
            z = true;
        } else {
            z = false;
        }
        if (i4 == null || i4.getVisibility() == 8) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i6 == null || i6.getVisibility() == 8) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!(z3 || i5 == null || (findViewById2 = i5.findViewById(C2215f.f6548K)) == null)) {
            findViewById2.setVisibility(0);
        }
        if (z2) {
            NestedScrollView nestedScrollView = this.f1076A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            if (this.f1100f == null && this.f1101g == null) {
                view = null;
            } else {
                view = i4.findViewById(C2215f.f6551N);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (!(i5 == null || (findViewById = i5.findViewById(C2215f.f6549L)) == null)) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f1101g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).mo420a(z2, z3);
        }
        if (!z) {
            View view2 = this.f1101g;
            if (view2 == null) {
                view2 = this.f1076A;
            }
            if (view2 != null) {
                if (z3) {
                    c = 2;
                }
                m464p(i5, view2, z2 | c ? 1 : 0, 3);
            }
        }
        ListView listView2 = this.f1101g;
        if (listView2 != null && (listAdapter = this.f1083H) != null) {
            listView2.setAdapter(listAdapter);
            int i7 = this.f1084I;
            if (i7 > -1) {
                listView2.setItemChecked(i7, true);
                listView2.setSelection(i7);
            }
        }
    }

    /* renamed from: z */
    private static boolean m470z(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C2210a.f6454j, typedValue, true);
        if (typedValue.data != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public Button mo405c(int i) {
        if (i == -3) {
            return this.f1117w;
        }
        if (i == -2) {
            return this.f1113s;
        }
        if (i != -1) {
            return null;
        }
        return this.f1109o;
    }

    /* renamed from: d */
    public int mo406d(int i) {
        TypedValue typedValue = new TypedValue();
        this.f1095a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: e */
    public ListView mo407e() {
        return this.f1101g;
    }

    /* renamed from: f */
    public void mo408f() {
        this.f1096b.setContentView(m463j());
        m469y();
    }

    /* renamed from: g */
    public boolean mo409g(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1076A;
        return nestedScrollView != null && nestedScrollView.executeKeyEvent(keyEvent);
    }

    /* renamed from: h */
    public boolean mo410h(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1076A;
        return nestedScrollView != null && nestedScrollView.executeKeyEvent(keyEvent);
    }

    /* renamed from: k */
    public void mo411k(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f1093R.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f1118x = charSequence;
            this.f1119y = message;
            this.f1120z = drawable;
        } else if (i == -2) {
            this.f1114t = charSequence;
            this.f1115u = message;
            this.f1116v = drawable;
        } else if (i == -1) {
            this.f1110p = charSequence;
            this.f1111q = message;
            this.f1112r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: l */
    public void mo412l(View view) {
        this.f1082G = view;
    }

    /* renamed from: m */
    public void mo413m(int i) {
        this.f1078C = null;
        this.f1077B = i;
        ImageView imageView = this.f1079D;
        if (imageView == null) {
            return;
        }
        if (i != 0) {
            imageView.setVisibility(0);
            this.f1079D.setImageResource(this.f1077B);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: n */
    public void mo414n(Drawable drawable) {
        this.f1078C = drawable;
        this.f1077B = 0;
        ImageView imageView = this.f1079D;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            this.f1079D.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: o */
    public void mo415o(CharSequence charSequence) {
        this.f1100f = charSequence;
        TextView textView = this.f1081F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: q */
    public void mo416q(CharSequence charSequence) {
        this.f1099e = charSequence;
        TextView textView = this.f1080E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: r */
    public void mo417r(int i) {
        this.f1102h = null;
        this.f1103i = i;
        this.f1108n = false;
    }

    /* renamed from: s */
    public void mo418s(View view) {
        this.f1102h = view;
        this.f1103i = 0;
        this.f1108n = false;
    }

    /* renamed from: t */
    public void mo419t(View view, int i, int i2, int i3, int i4) {
        this.f1102h = view;
        this.f1103i = 0;
        this.f1108n = true;
        this.f1104j = i;
        this.f1105k = i2;
        this.f1106l = i3;
        this.f1107m = i4;
    }
}
