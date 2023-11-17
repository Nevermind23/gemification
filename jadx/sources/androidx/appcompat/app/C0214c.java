package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import p030c.C2210a;

/* renamed from: androidx.appcompat.app.c */
public class C0214c extends C0253u implements DialogInterface {

    /* renamed from: h */
    final AlertController f1285h = new AlertController(getContext(), this, getWindow());

    /* renamed from: androidx.appcompat.app.c$a */
    public static class C0215a {

        /* renamed from: P */
        private final AlertController.C0177b f1286P;
        private final int mTheme;

        public C0215a(Context context) {
            this(context, C0214c.m673k(context, 0));
        }

        public C0214c create() {
            C0214c cVar = new C0214c(this.f1286P.f1140a, this.mTheme);
            this.f1286P.mo422a(cVar.f1285h);
            cVar.setCancelable(this.f1286P.f1157r);
            if (this.f1286P.f1157r) {
                cVar.setCanceledOnTouchOutside(true);
            }
            cVar.setOnCancelListener(this.f1286P.f1158s);
            cVar.setOnDismissListener(this.f1286P.f1159t);
            DialogInterface.OnKeyListener onKeyListener = this.f1286P.f1160u;
            if (onKeyListener != null) {
                cVar.setOnKeyListener(onKeyListener);
            }
            return cVar;
        }

        public Context getContext() {
            return this.f1286P.f1140a;
        }

        public C0215a setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0177b bVar = this.f1286P;
            bVar.f1162w = listAdapter;
            bVar.f1163x = onClickListener;
            return this;
        }

        public C0215a setCancelable(boolean z) {
            this.f1286P.f1157r = z;
            return this;
        }

        public C0215a setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            AlertController.C0177b bVar = this.f1286P;
            bVar.f1134K = cursor;
            bVar.f1135L = str;
            bVar.f1163x = onClickListener;
            return this;
        }

        public C0215a setCustomTitle(View view) {
            this.f1286P.f1146g = view;
            return this;
        }

        public C0215a setIcon(int i) {
            this.f1286P.f1142c = i;
            return this;
        }

        public C0215a setIconAttribute(int i) {
            TypedValue typedValue = new TypedValue();
            this.f1286P.f1140a.getTheme().resolveAttribute(i, typedValue, true);
            this.f1286P.f1142c = typedValue.resourceId;
            return this;
        }

        @Deprecated
        public C0215a setInverseBackgroundForced(boolean z) {
            this.f1286P.f1137N = z;
            return this;
        }

        public C0215a setItems(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0177b bVar = this.f1286P;
            bVar.f1161v = bVar.f1140a.getResources().getTextArray(i);
            this.f1286P.f1163x = onClickListener;
            return this;
        }

        public C0215a setMessage(int i) {
            AlertController.C0177b bVar = this.f1286P;
            bVar.f1147h = bVar.f1140a.getText(i);
            return this;
        }

        public C0215a setMultiChoiceItems(int i, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.C0177b bVar = this.f1286P;
            bVar.f1161v = bVar.f1140a.getResources().getTextArray(i);
            AlertController.C0177b bVar2 = this.f1286P;
            bVar2.f1133J = onMultiChoiceClickListener;
            bVar2.f1129F = zArr;
            bVar2.f1130G = true;
            return this;
        }

        public C0215a setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0177b bVar = this.f1286P;
            bVar.f1151l = bVar.f1140a.getText(i);
            this.f1286P.f1153n = onClickListener;
            return this;
        }

        public C0215a setNegativeButtonIcon(Drawable drawable) {
            this.f1286P.f1152m = drawable;
            return this;
        }

        public C0215a setNeutralButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0177b bVar = this.f1286P;
            bVar.f1154o = bVar.f1140a.getText(i);
            this.f1286P.f1156q = onClickListener;
            return this;
        }

        public C0215a setNeutralButtonIcon(Drawable drawable) {
            this.f1286P.f1155p = drawable;
            return this;
        }

        public C0215a setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.f1286P.f1158s = onCancelListener;
            return this;
        }

        public C0215a setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.f1286P.f1159t = onDismissListener;
            return this;
        }

        public C0215a setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.f1286P.f1138O = onItemSelectedListener;
            return this;
        }

        public C0215a setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
            this.f1286P.f1160u = onKeyListener;
            return this;
        }

        public C0215a setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0177b bVar = this.f1286P;
            bVar.f1148i = bVar.f1140a.getText(i);
            this.f1286P.f1150k = onClickListener;
            return this;
        }

        public C0215a setPositiveButtonIcon(Drawable drawable) {
            this.f1286P.f1149j = drawable;
            return this;
        }

        public C0215a setRecycleOnMeasureEnabled(boolean z) {
            this.f1286P.f1139P = z;
            return this;
        }

        public C0215a setSingleChoiceItems(int i, int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0177b bVar = this.f1286P;
            bVar.f1161v = bVar.f1140a.getResources().getTextArray(i);
            AlertController.C0177b bVar2 = this.f1286P;
            bVar2.f1163x = onClickListener;
            bVar2.f1132I = i2;
            bVar2.f1131H = true;
            return this;
        }

        public C0215a setTitle(int i) {
            AlertController.C0177b bVar = this.f1286P;
            bVar.f1145f = bVar.f1140a.getText(i);
            return this;
        }

        public C0215a setView(int i) {
            AlertController.C0177b bVar = this.f1286P;
            bVar.f1165z = null;
            bVar.f1164y = i;
            bVar.f1128E = false;
            return this;
        }

        public C0214c show() {
            C0214c create = create();
            create.show();
            return create;
        }

        public C0215a(Context context, int i) {
            this.f1286P = new AlertController.C0177b(new ContextThemeWrapper(context, C0214c.m673k(context, i)));
            this.mTheme = i;
        }

        public C0215a setIcon(Drawable drawable) {
            this.f1286P.f1143d = drawable;
            return this;
        }

        public C0215a setMessage(CharSequence charSequence) {
            this.f1286P.f1147h = charSequence;
            return this;
        }

        public C0215a setTitle(CharSequence charSequence) {
            this.f1286P.f1145f = charSequence;
            return this;
        }

        public C0215a setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0177b bVar = this.f1286P;
            bVar.f1161v = charSequenceArr;
            bVar.f1163x = onClickListener;
            return this;
        }

        public C0215a setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0177b bVar = this.f1286P;
            bVar.f1151l = charSequence;
            bVar.f1153n = onClickListener;
            return this;
        }

        public C0215a setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0177b bVar = this.f1286P;
            bVar.f1154o = charSequence;
            bVar.f1156q = onClickListener;
            return this;
        }

        public C0215a setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0177b bVar = this.f1286P;
            bVar.f1148i = charSequence;
            bVar.f1150k = onClickListener;
            return this;
        }

        public C0215a setView(View view) {
            AlertController.C0177b bVar = this.f1286P;
            bVar.f1165z = view;
            bVar.f1164y = 0;
            bVar.f1128E = false;
            return this;
        }

        public C0215a setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.C0177b bVar = this.f1286P;
            bVar.f1161v = charSequenceArr;
            bVar.f1133J = onMultiChoiceClickListener;
            bVar.f1129F = zArr;
            bVar.f1130G = true;
            return this;
        }

        public C0215a setSingleChoiceItems(Cursor cursor, int i, String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0177b bVar = this.f1286P;
            bVar.f1134K = cursor;
            bVar.f1163x = onClickListener;
            bVar.f1132I = i;
            bVar.f1135L = str;
            bVar.f1131H = true;
            return this;
        }

        @Deprecated
        public C0215a setView(View view, int i, int i2, int i3, int i4) {
            AlertController.C0177b bVar = this.f1286P;
            bVar.f1165z = view;
            bVar.f1164y = 0;
            bVar.f1128E = true;
            bVar.f1124A = i;
            bVar.f1125B = i2;
            bVar.f1126C = i3;
            bVar.f1127D = i4;
            return this;
        }

        public C0215a setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.C0177b bVar = this.f1286P;
            bVar.f1134K = cursor;
            bVar.f1133J = onMultiChoiceClickListener;
            bVar.f1136M = str;
            bVar.f1135L = str2;
            bVar.f1130G = true;
            return this;
        }

        public C0215a setSingleChoiceItems(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0177b bVar = this.f1286P;
            bVar.f1161v = charSequenceArr;
            bVar.f1163x = onClickListener;
            bVar.f1132I = i;
            bVar.f1131H = true;
            return this;
        }

        public C0215a setSingleChoiceItems(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0177b bVar = this.f1286P;
            bVar.f1162w = listAdapter;
            bVar.f1163x = onClickListener;
            bVar.f1132I = i;
            bVar.f1131H = true;
            return this;
        }
    }

    protected C0214c(Context context, int i) {
        super(context, m673k(context, i));
    }

    /* renamed from: k */
    static int m673k(Context context, int i) {
        if (((i >>> 24) & C11051p3.f31759c) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C2210a.f6456l, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: i */
    public Button mo574i(int i) {
        return this.f1285h.mo405c(i);
    }

    /* renamed from: j */
    public ListView mo575j() {
        return this.f1285h.mo407e();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1285h.mo408f();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f1285h.mo409g(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f1285h.mo410h(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f1285h.mo416q(charSequence);
    }
}
