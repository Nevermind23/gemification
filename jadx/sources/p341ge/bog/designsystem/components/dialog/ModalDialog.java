package p341ge.bog.designsystem.components.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import androidx.appcompat.app.C0214c;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1483c;
import com.google.android.flexbox.FlexboxLayout;
import he1.C41217g;
import he1.C41233s;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.infobadge.InfoBadgeView;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p352ak.C9956l0;
import p601sg.C17779d;
import p642vh.C18368l;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.dialog.ModalDialog */
public class ModalDialog extends C1483c {

    /* renamed from: z */
    public static final C13302c f39354z = new C13302c((DefaultConstructorMarker) null);

    /* renamed from: t */
    private C9956l0 f39355t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public C13303d f39356u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public C13303d f39357v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C13303d f39358w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public C13305f f39359x;

    /* renamed from: y */
    private final C41217g f39360y = C41219i.m119470b(new C13306g(this));

    /* renamed from: ge.bog.designsystem.components.dialog.ModalDialog$CheckBoxModel */
    public static final class CheckBoxModel implements Parcelable {
        public static final Parcelable.Creator<CheckBoxModel> CREATOR = new C13297a();

        /* renamed from: d */
        private boolean f39361d;

        /* renamed from: e */
        private String f39362e;

        /* renamed from: f */
        private CheckboxView.C13224d f39363f;

        /* renamed from: ge.bog.designsystem.components.dialog.ModalDialog$CheckBoxModel$a */
        public static final class C13297a implements Parcelable.Creator {
            /* renamed from: a */
            public final CheckBoxModel createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new CheckBoxModel(parcel.readInt() != 0, parcel.readString(), CheckboxView.C13224d.valueOf(parcel.readString()));
            }

            /* renamed from: b */
            public final CheckBoxModel[] newArray(int i) {
                return new CheckBoxModel[i];
            }
        }

        public CheckBoxModel(boolean z, String str, CheckboxView.C13224d dVar) {
            C41536l.m120489i(str, "text");
            C41536l.m120489i(dVar, "type");
            this.f39361d = z;
            this.f39362e = str;
            this.f39363f = dVar;
        }

        /* renamed from: a */
        public final String mo35573a() {
            return this.f39362e;
        }

        /* renamed from: b */
        public final CheckboxView.C13224d mo35574b() {
            return this.f39363f;
        }

        /* renamed from: d */
        public final boolean mo35575d() {
            return this.f39361d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CheckBoxModel)) {
                return false;
            }
            CheckBoxModel checkBoxModel = (CheckBoxModel) obj;
            return this.f39361d == checkBoxModel.f39361d && C41536l.m120484d(this.f39362e, checkBoxModel.f39362e) && this.f39363f == checkBoxModel.f39363f;
        }

        public int hashCode() {
            boolean z = this.f39361d;
            if (z) {
                z = true;
            }
            return ((((z ? 1 : 0) * true) + this.f39362e.hashCode()) * 31) + this.f39363f.hashCode();
        }

        public String toString() {
            boolean z = this.f39361d;
            String str = this.f39362e;
            CheckboxView.C13224d dVar = this.f39363f;
            return "CheckBoxModel(isChecked=" + z + ", text=" + str + ", type=" + dVar + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(this.f39361d ? 1 : 0);
            parcel.writeString(this.f39362e);
            parcel.writeString(this.f39363f.name());
        }
    }

    /* renamed from: ge.bog.designsystem.components.dialog.ModalDialog$InfoBadgeModel */
    public static final class InfoBadgeModel implements Parcelable {
        public static final Parcelable.Creator<InfoBadgeModel> CREATOR = new C13298a();

        /* renamed from: d */
        private final String f39364d;

        /* renamed from: e */
        private final InfoBadgeView.C13346b f39365e;

        /* renamed from: f */
        private final InfoBadgeView.C13345a f39366f;

        /* renamed from: ge.bog.designsystem.components.dialog.ModalDialog$InfoBadgeModel$a */
        public static final class C13298a implements Parcelable.Creator {
            /* renamed from: a */
            public final InfoBadgeModel createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new InfoBadgeModel(parcel.readString(), InfoBadgeView.C13346b.valueOf(parcel.readString()), InfoBadgeView.C13345a.valueOf(parcel.readString()));
            }

            /* renamed from: b */
            public final InfoBadgeModel[] newArray(int i) {
                return new InfoBadgeModel[i];
            }
        }

        public InfoBadgeModel(String str, InfoBadgeView.C13346b bVar, InfoBadgeView.C13345a aVar) {
            C41536l.m120489i(str, "text");
            C41536l.m120489i(bVar, "type");
            C41536l.m120489i(aVar, "size");
            this.f39364d = str;
            this.f39365e = bVar;
            this.f39366f = aVar;
        }

        /* renamed from: a */
        public final InfoBadgeView.C13345a mo35585a() {
            return this.f39366f;
        }

        /* renamed from: b */
        public final String mo35586b() {
            return this.f39364d;
        }

        /* renamed from: d */
        public final InfoBadgeView.C13346b mo35587d() {
            return this.f39365e;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InfoBadgeModel)) {
                return false;
            }
            InfoBadgeModel infoBadgeModel = (InfoBadgeModel) obj;
            return C41536l.m120484d(this.f39364d, infoBadgeModel.f39364d) && this.f39365e == infoBadgeModel.f39365e && this.f39366f == infoBadgeModel.f39366f;
        }

        public int hashCode() {
            return (((this.f39364d.hashCode() * 31) + this.f39365e.hashCode()) * 31) + this.f39366f.hashCode();
        }

        public String toString() {
            String str = this.f39364d;
            InfoBadgeView.C13346b bVar = this.f39365e;
            InfoBadgeView.C13345a aVar = this.f39366f;
            return "InfoBadgeModel(text=" + str + ", type=" + bVar + ", size=" + aVar + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeString(this.f39364d);
            parcel.writeString(this.f39365e.name());
            parcel.writeString(this.f39366f.name());
        }
    }

    /* renamed from: ge.bog.designsystem.components.dialog.ModalDialog$ModalDialogParams */
    private static final class ModalDialogParams implements Parcelable {
        public static final Parcelable.Creator<ModalDialogParams> CREATOR = new C13299a();

        /* renamed from: d */
        private String f39367d;

        /* renamed from: e */
        private String f39368e;

        /* renamed from: f */
        private String f39369f;

        /* renamed from: g */
        private String f39370g;

        /* renamed from: h */
        private Image f39371h;

        /* renamed from: i */
        private CheckBoxModel f39372i;

        /* renamed from: j */
        private boolean f39373j;

        /* renamed from: k */
        private Integer f39374k;

        /* renamed from: l */
        private final ArrayList f39375l;

        /* renamed from: ge.bog.designsystem.components.dialog.ModalDialog$ModalDialogParams$a */
        public static final class C13299a implements Parcelable.Creator {
            /* renamed from: a */
            public final ModalDialogParams createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                Image image = (Image) parcel.readParcelable(ModalDialogParams.class.getClassLoader());
                Integer num = null;
                CheckBoxModel createFromParcel = parcel.readInt() == 0 ? null : CheckBoxModel.CREATOR.createFromParcel(parcel);
                boolean z = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    num = Integer.valueOf(parcel.readInt());
                }
                Integer num2 = num;
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(InfoBadgeModel.CREATOR.createFromParcel(parcel));
                }
                return new ModalDialogParams(readString, readString2, readString3, readString4, image, createFromParcel, z, num2, arrayList);
            }

            /* renamed from: b */
            public final ModalDialogParams[] newArray(int i) {
                return new ModalDialogParams[i];
            }
        }

        public ModalDialogParams() {
            this((String) null, (String) null, (String) null, (String) null, (Image) null, (CheckBoxModel) null, false, (Integer) null, (ArrayList) null, 511, (DefaultConstructorMarker) null);
        }

        /* renamed from: a */
        public final CheckBoxModel mo35597a() {
            return this.f39372i;
        }

        /* renamed from: b */
        public final Integer mo35598b() {
            return this.f39374k;
        }

        /* renamed from: d */
        public final boolean mo35599d() {
            return this.f39373j;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public final Image mo35601e() {
            return this.f39371h;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ModalDialogParams)) {
                return false;
            }
            ModalDialogParams modalDialogParams = (ModalDialogParams) obj;
            return C41536l.m120484d(this.f39367d, modalDialogParams.f39367d) && C41536l.m120484d(this.f39368e, modalDialogParams.f39368e) && C41536l.m120484d(this.f39369f, modalDialogParams.f39369f) && C41536l.m120484d(this.f39370g, modalDialogParams.f39370g) && C41536l.m120484d(this.f39371h, modalDialogParams.f39371h) && C41536l.m120484d(this.f39372i, modalDialogParams.f39372i) && this.f39373j == modalDialogParams.f39373j && C41536l.m120484d(this.f39374k, modalDialogParams.f39374k) && C41536l.m120484d(this.f39375l, modalDialogParams.f39375l);
        }

        /* renamed from: f */
        public final ArrayList mo35603f() {
            return this.f39375l;
        }

        /* renamed from: g */
        public final String mo35604g() {
            return this.f39370g;
        }

        /* renamed from: h */
        public final String mo35605h() {
            return this.f39369f;
        }

        public int hashCode() {
            int hashCode = ((this.f39367d.hashCode() * 31) + this.f39368e.hashCode()) * 31;
            String str = this.f39369f;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f39370g;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Image image = this.f39371h;
            int hashCode4 = (hashCode3 + (image == null ? 0 : image.hashCode())) * 31;
            CheckBoxModel checkBoxModel = this.f39372i;
            int hashCode5 = (hashCode4 + (checkBoxModel == null ? 0 : checkBoxModel.hashCode())) * 31;
            boolean z = this.f39373j;
            if (z) {
                z = true;
            }
            int i2 = (hashCode5 + (z ? 1 : 0)) * 31;
            Integer num = this.f39374k;
            if (num != null) {
                i = num.hashCode();
            }
            return ((i2 + i) * 31) + this.f39375l.hashCode();
        }

        /* renamed from: i */
        public final String mo35607i() {
            return this.f39368e;
        }

        /* renamed from: j */
        public final String mo35608j() {
            return this.f39367d;
        }

        /* renamed from: k */
        public final void mo35609k(Image image) {
            this.f39371h = image;
        }

        /* renamed from: l */
        public final void mo35610l(String str) {
            this.f39369f = str;
        }

        /* renamed from: m */
        public final void mo35611m(String str) {
            C41536l.m120489i(str, "<set-?>");
            this.f39368e = str;
        }

        /* renamed from: p */
        public final void mo35612p(String str) {
            C41536l.m120489i(str, "<set-?>");
            this.f39367d = str;
        }

        public String toString() {
            String str = this.f39367d;
            String str2 = this.f39368e;
            String str3 = this.f39369f;
            String str4 = this.f39370g;
            Image image = this.f39371h;
            CheckBoxModel checkBoxModel = this.f39372i;
            boolean z = this.f39373j;
            Integer num = this.f39374k;
            ArrayList arrayList = this.f39375l;
            return "ModalDialogParams(title=" + str + ", text=" + str2 + ", positiveButtonText=" + str3 + ", negativeButtonText=" + str4 + ", image=" + image + ", checkBox=" + checkBoxModel + ", hasCloseButton=" + z + ", closeButtonTintColor=" + num + ", infoBadges=" + arrayList + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeString(this.f39367d);
            parcel.writeString(this.f39368e);
            parcel.writeString(this.f39369f);
            parcel.writeString(this.f39370g);
            parcel.writeParcelable(this.f39371h, i);
            CheckBoxModel checkBoxModel = this.f39372i;
            if (checkBoxModel == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                checkBoxModel.writeToParcel(parcel, i);
            }
            parcel.writeInt(this.f39373j ? 1 : 0);
            Integer num = this.f39374k;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
            ArrayList arrayList = this.f39375l;
            parcel.writeInt(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InfoBadgeModel) it.next()).writeToParcel(parcel, i);
            }
        }

        public ModalDialogParams(String str, String str2, String str3, String str4, Image image, CheckBoxModel checkBoxModel, boolean z, Integer num, ArrayList arrayList) {
            C41536l.m120489i(str, "title");
            C41536l.m120489i(str2, "text");
            C41536l.m120489i(arrayList, "infoBadges");
            this.f39367d = str;
            this.f39368e = str2;
            this.f39369f = str3;
            this.f39370g = str4;
            this.f39371h = image;
            this.f39372i = checkBoxModel;
            this.f39373j = z;
            this.f39374k = num;
            this.f39375l = arrayList;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ ModalDialogParams(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, p341ge.bog.designsystem.components.common.Image r15, p341ge.bog.designsystem.components.dialog.ModalDialog.CheckBoxModel r16, boolean r17, java.lang.Integer r18, java.util.ArrayList r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
            /*
                r10 = this;
                r0 = r20
                r1 = r0 & 1
                java.lang.String r2 = ""
                if (r1 == 0) goto L_0x000a
                r1 = r2
                goto L_0x000b
            L_0x000a:
                r1 = r11
            L_0x000b:
                r3 = r0 & 2
                if (r3 == 0) goto L_0x0010
                goto L_0x0011
            L_0x0010:
                r2 = r12
            L_0x0011:
                r3 = r0 & 4
                r4 = 0
                if (r3 == 0) goto L_0x0018
                r3 = r4
                goto L_0x0019
            L_0x0018:
                r3 = r13
            L_0x0019:
                r5 = r0 & 8
                if (r5 == 0) goto L_0x001f
                r5 = r4
                goto L_0x0020
            L_0x001f:
                r5 = r14
            L_0x0020:
                r6 = r0 & 16
                if (r6 == 0) goto L_0x0026
                r6 = r4
                goto L_0x0027
            L_0x0026:
                r6 = r15
            L_0x0027:
                r7 = r0 & 32
                if (r7 == 0) goto L_0x002d
                r7 = r4
                goto L_0x002f
            L_0x002d:
                r7 = r16
            L_0x002f:
                r8 = r0 & 64
                if (r8 == 0) goto L_0x0035
                r8 = 1
                goto L_0x0037
            L_0x0035:
                r8 = r17
            L_0x0037:
                r9 = r0 & 128(0x80, float:1.794E-43)
                if (r9 == 0) goto L_0x003c
                goto L_0x003e
            L_0x003c:
                r4 = r18
            L_0x003e:
                r0 = r0 & 256(0x100, float:3.59E-43)
                if (r0 == 0) goto L_0x0048
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                goto L_0x004a
            L_0x0048:
                r0 = r19
            L_0x004a:
                r11 = r10
                r12 = r1
                r13 = r2
                r14 = r3
                r15 = r5
                r16 = r6
                r17 = r7
                r18 = r8
                r19 = r4
                r20 = r0
                r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.dialog.ModalDialog.ModalDialogParams.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, ge.bog.designsystem.components.common.Image, ge.bog.designsystem.components.dialog.ModalDialog$CheckBoxModel, boolean, java.lang.Integer, java.util.ArrayList, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    /* renamed from: ge.bog.designsystem.components.dialog.ModalDialog$a */
    public static final class C13300a {

        /* renamed from: a */
        private final ModalDialogParams f39376a = new ModalDialogParams((String) null, (String) null, (String) null, (String) null, (Image) null, (CheckBoxModel) null, false, (Integer) null, (ArrayList) null, 511, (DefaultConstructorMarker) null);

        /* renamed from: b */
        private C13303d f39377b;

        /* renamed from: c */
        private C13303d f39378c;

        /* renamed from: d */
        private C13303d f39379d;

        /* renamed from: e */
        private C13305f f39380e;

        /* renamed from: a */
        public final ModalDialog mo35619a() {
            ModalDialog modalDialog = new ModalDialog();
            modalDialog.setArguments(C0908e.m3336b(C41233s.m119492a("modal_dialog_params", this.f39376a)));
            modalDialog.getClass();
            modalDialog.f39356u = this.f39377b;
            modalDialog.f39357v = this.f39378c;
            modalDialog.f39358w = this.f39379d;
            modalDialog.f39359x = this.f39380e;
            return modalDialog;
        }

        /* renamed from: b */
        public final C13300a mo35620b(Image image) {
            this.f39376a.mo35609k(image);
            return this;
        }

        /* renamed from: c */
        public final C13300a mo35621c(C13305f fVar) {
            C41536l.m120489i(fVar, "listener");
            this.f39380e = fVar;
            return this;
        }

        /* renamed from: d */
        public final C13300a mo35622d(String str, C13303d dVar) {
            C41536l.m120489i(str, "text");
            C41536l.m120489i(dVar, "listener");
            this.f39376a.mo35610l(str);
            this.f39377b = dVar;
            return this;
        }

        /* renamed from: e */
        public final C13300a mo35623e(String str) {
            C41536l.m120489i(str, "text");
            this.f39376a.mo35611m(str);
            return this;
        }

        /* renamed from: f */
        public final C13300a mo35624f(String str) {
            C41536l.m120489i(str, "title");
            this.f39376a.mo35612p(str);
            return this;
        }
    }

    /* renamed from: ge.bog.designsystem.components.dialog.ModalDialog$b */
    public static final class C13301b {

        /* renamed from: a */
        private final Button f39381a;

        /* renamed from: b */
        private final ModalDialog f39382b;

        public C13301b(Button button, ModalDialog modalDialog) {
            C41536l.m120489i(button, "button");
            C41536l.m120489i(modalDialog, "dialog");
            this.f39381a = button;
            this.f39382b = modalDialog;
        }

        /* renamed from: a */
        public final ModalDialog mo35625a() {
            return this.f39382b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13301b)) {
                return false;
            }
            C13301b bVar = (C13301b) obj;
            return C41536l.m120484d(this.f39381a, bVar.f39381a) && C41536l.m120484d(this.f39382b, bVar.f39382b);
        }

        public int hashCode() {
            return (this.f39381a.hashCode() * 31) + this.f39382b.hashCode();
        }

        public String toString() {
            Button button = this.f39381a;
            ModalDialog modalDialog = this.f39382b;
            return "ButtonClickModel(button=" + button + ", dialog=" + modalDialog + ")";
        }
    }

    /* renamed from: ge.bog.designsystem.components.dialog.ModalDialog$c */
    public static final class C13302c {
        private C13302c() {
        }

        public /* synthetic */ C13302c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.designsystem.components.dialog.ModalDialog$d */
    public interface C13303d {
        /* renamed from: a */
        void mo35629a(C13301b bVar);
    }

    /* renamed from: ge.bog.designsystem.components.dialog.ModalDialog$e */
    public interface C13304e {
    }

    /* renamed from: ge.bog.designsystem.components.dialog.ModalDialog$f */
    public interface C13305f {
        void onDismiss();
    }

    /* renamed from: ge.bog.designsystem.components.dialog.ModalDialog$g */
    static final class C13306g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ModalDialog f39383d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13306g(ModalDialog modalDialog) {
            super(0);
            this.f39383d = modalDialog;
        }

        /* renamed from: b */
        public final ModalDialogParams invoke() {
            Bundle arguments = this.f39383d.getArguments();
            ModalDialogParams modalDialogParams = null;
            ModalDialogParams modalDialogParams2 = arguments != null ? (ModalDialogParams) arguments.getParcelable("modal_dialog_params") : null;
            if (modalDialogParams2 instanceof ModalDialogParams) {
                modalDialogParams = modalDialogParams2;
            }
            if (modalDialogParams != null) {
                return modalDialogParams;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: K1 */
    private final ModalDialogParams m50041K1() {
        return (ModalDialogParams) this.f39360y.getValue();
    }

    /* renamed from: L1 */
    private final void m50042L1(Button button, String str) {
        boolean z;
        int i = 0;
        if (str != null) {
            button.setButtonText(str);
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = 8;
        }
        button.setVisibility(i);
    }

    /* renamed from: M1 */
    private final void m50043M1() {
        boolean z;
        C9956l0 l0Var = this.f39355t;
        if (l0Var == null) {
            C41536l.m120506z("binding");
            l0Var = null;
        }
        Button button = l0Var.f27227j;
        C41536l.m120488h(button, "positiveButton");
        m50042L1(button, m50041K1().mo35605h());
        Button button2 = l0Var.f27226i;
        C41536l.m120488h(button2, "negativeButton");
        m50042L1(button2, m50041K1().mo35604g());
        Button button3 = l0Var.f27230m.f27761e;
        C41536l.m120488h(button3, "titleWithClose.navigateButton");
        int i = 0;
        if (m50041K1().mo35599d()) {
            Integer b = m50041K1().mo35598b();
            if (b != null) {
                l0Var.f27230m.f27761e.setButtonIconTint(ColorStateList.valueOf(b.intValue()));
            }
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = 8;
        }
        button3.setVisibility(i);
    }

    /* renamed from: N1 */
    private final void m50044N1() {
        boolean z;
        boolean z2;
        String str;
        CheckboxView.C13224d b;
        C9956l0 l0Var = this.f39355t;
        C9956l0 l0Var2 = null;
        if (l0Var == null) {
            C41536l.m120506z("binding");
            l0Var = null;
        }
        l0Var.f27223f.setOnCheckedStateChangeListener(new C13316h(this));
        C9956l0 l0Var3 = this.f39355t;
        if (l0Var3 == null) {
            C41536l.m120506z("binding");
            l0Var3 = null;
        }
        CheckboxView checkboxView = l0Var3.f27223f;
        C41536l.m120488h(checkboxView, "binding.checkBox");
        int i = 0;
        if (m50041K1().mo35597a() != null) {
            C9956l0 l0Var4 = this.f39355t;
            if (l0Var4 == null) {
                C41536l.m120506z("binding");
                l0Var4 = null;
            }
            CheckboxView checkboxView2 = l0Var4.f27223f;
            CheckBoxModel a = m50041K1().mo35597a();
            if (a != null) {
                z2 = a.mo35575d();
            } else {
                z2 = false;
            }
            checkboxView2.setChecked(z2);
            C9956l0 l0Var5 = this.f39355t;
            if (l0Var5 == null) {
                C41536l.m120506z("binding");
                l0Var5 = null;
            }
            CheckboxView checkboxView3 = l0Var5.f27223f;
            CheckBoxModel a2 = m50041K1().mo35597a();
            if (a2 != null) {
                str = a2.mo35573a();
            } else {
                str = null;
            }
            checkboxView3.setText(str);
            CheckBoxModel a3 = m50041K1().mo35597a();
            if (!(a3 == null || (b = a3.mo35574b()) == null)) {
                C9956l0 l0Var6 = this.f39355t;
                if (l0Var6 == null) {
                    C41536l.m120506z("binding");
                } else {
                    l0Var2 = l0Var6;
                }
                l0Var2.f27223f.setType$design_system_release(b);
            }
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = 8;
        }
        checkboxView.setVisibility(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: O1 */
    public static final void m50045O1(ModalDialog modalDialog, CompoundButton compoundButton, boolean z, boolean z2) {
        C41536l.m120489i(modalDialog, "this$0");
        C41536l.m120489i(compoundButton, "<anonymous parameter 0>");
        modalDialog.getClass();
    }

    /* renamed from: P1 */
    private final void m50046P1() {
        C9956l0 l0Var = null;
        if (m50041K1().mo35603f().isEmpty()) {
            C9956l0 l0Var2 = this.f39355t;
            if (l0Var2 == null) {
                C41536l.m120506z("binding");
            } else {
                l0Var = l0Var2;
            }
            FlexboxLayout flexboxLayout = l0Var.f27225h;
            C41536l.m120488h(flexboxLayout, "binding.infoBadgeContainer");
            flexboxLayout.setVisibility(8);
            return;
        }
        if (m50041K1().mo35599d() && m50041K1().mo35601e() == null) {
            C9956l0 l0Var3 = this.f39355t;
            if (l0Var3 == null) {
                C41536l.m120506z("binding");
                l0Var3 = null;
            }
            FlexboxLayout flexboxLayout2 = l0Var3.f27225h;
            C41536l.m120488h(flexboxLayout2, "binding.infoBadgeContainer");
            ViewGroup.LayoutParams layoutParams = flexboxLayout2.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginEnd(getResources().getDimensionPixelSize(C17779d.spacing_24));
                flexboxLayout2.setLayoutParams(marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(C17779d.f49645S1);
        for (InfoBadgeModel infoBadgeModel : m50041K1().mo35603f()) {
            Context requireContext = requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            InfoBadgeView infoBadgeView = new InfoBadgeView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            infoBadgeView.setSize(infoBadgeModel.mo35585a());
            infoBadgeView.setType(infoBadgeModel.mo35587d());
            InfoBadgeView.m50233e(infoBadgeView, infoBadgeModel.mo35586b(), (String) null, (String) null, 6, (Object) null);
            C9956l0 l0Var4 = this.f39355t;
            if (l0Var4 == null) {
                C41536l.m120506z("binding");
                l0Var4 = null;
            }
            l0Var4.f27225h.addView(infoBadgeView);
            ViewGroup.LayoutParams layoutParams2 = infoBadgeView.getLayoutParams();
            if (layoutParams2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.setMargins(dimensionPixelSize, dimensionPixelSize, 0, 0);
                infoBadgeView.setLayoutParams(marginLayoutParams2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
    }

    /* renamed from: Q1 */
    private final void m50047Q1() {
        m50043M1();
        m50053W1(m50041K1().mo35608j(), m50041K1().mo35607i());
        m50048R1();
        m50046P1();
        m50044N1();
    }

    /* renamed from: R1 */
    private final void m50048R1() {
        boolean z;
        C9956l0 l0Var = this.f39355t;
        if (l0Var == null) {
            C41536l.m120506z("binding");
            l0Var = null;
        }
        AppCompatImageView appCompatImageView = l0Var.f27224g;
        C41536l.m120488h(appCompatImageView, "binding.image");
        int i = 0;
        if (m50041K1().mo35601e() != null) {
            C9956l0 l0Var2 = this.f39355t;
            if (l0Var2 == null) {
                C41536l.m120506z("binding");
                l0Var2 = null;
            }
            AppCompatImageView appCompatImageView2 = l0Var2.f27224g;
            C41536l.m120488h(appCompatImageView2, "binding.image");
            C18368l.m62746A(appCompatImageView2, m50041K1().mo35601e(), (C43075l) null, 2, (Object) null);
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = 8;
        }
        appCompatImageView.setVisibility(i);
    }

    /* renamed from: S1 */
    private final void m50049S1() {
        C9956l0 l0Var = this.f39355t;
        if (l0Var == null) {
            C41536l.m120506z("binding");
            l0Var = null;
        }
        l0Var.f27227j.setOnClickListener(new C13313e(this));
        l0Var.f27226i.setOnClickListener(new C13314f(this));
        l0Var.f27230m.f27761e.setOnClickListener(new C13315g(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: T1 */
    public static final void m50050T1(ModalDialog modalDialog, View view) {
        C41536l.m120489i(modalDialog, "this$0");
        C13303d dVar = modalDialog.f39356u;
        if (dVar != null) {
            C41536l.m120487g(view, "null cannot be cast to non-null type ge.bog.designsystem.components.buttons.Button");
            dVar.mo35629a(new C13301b((Button) view, modalDialog));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public static final void m50051U1(ModalDialog modalDialog, View view) {
        C41536l.m120489i(modalDialog, "this$0");
        C13303d dVar = modalDialog.f39357v;
        if (dVar != null) {
            C41536l.m120487g(view, "null cannot be cast to non-null type ge.bog.designsystem.components.buttons.Button");
            dVar.mo35629a(new C13301b((Button) view, modalDialog));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: V1 */
    public static final void m50052V1(ModalDialog modalDialog, View view) {
        C41536l.m120489i(modalDialog, "this$0");
        modalDialog.mo4578l1();
        C13303d dVar = modalDialog.f39358w;
        if (dVar != null) {
            C41536l.m120487g(view, "null cannot be cast to non-null type ge.bog.designsystem.components.buttons.Button");
            dVar.mo35629a(new C13301b((Button) view, modalDialog));
        }
    }

    /* renamed from: W1 */
    private final void m50053W1(String str, String str2) {
        boolean z;
        int i;
        boolean z2;
        C9956l0 l0Var = this.f39355t;
        C9956l0 l0Var2 = null;
        if (l0Var == null) {
            C41536l.m120506z("binding");
            l0Var = null;
        }
        l0Var.f27229l.setText(str);
        C9956l0 l0Var3 = this.f39355t;
        if (l0Var3 == null) {
            C41536l.m120506z("binding");
            l0Var3 = null;
        }
        l0Var3.f27228k.setText(str2);
        C9956l0 l0Var4 = this.f39355t;
        if (l0Var4 == null) {
            C41536l.m120506z("binding");
            l0Var4 = null;
        }
        AppCompatTextView appCompatTextView = l0Var4.f27229l;
        C41536l.m120488h(appCompatTextView, "binding.title");
        int i2 = 0;
        if (str == null || C40439w.m117118v(str)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = 0;
        } else {
            i = 8;
        }
        appCompatTextView.setVisibility(i);
        C9956l0 l0Var5 = this.f39355t;
        if (l0Var5 == null) {
            C41536l.m120506z("binding");
        } else {
            l0Var2 = l0Var5;
        }
        AppCompatTextView appCompatTextView2 = l0Var2.f27228k;
        C41536l.m120488h(appCompatTextView2, "binding.textItem");
        if (str2 == null || C40439w.m117118v(str2)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(!z2)) {
            i2 = 8;
        }
        appCompatTextView2.setVisibility(i2);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        C41536l.m120489i(layoutInflater, "inflater");
        Dialog n1 = mo4579n1();
        if (!(n1 == null || (window = n1.getWindow()) == null)) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        C9956l0 l0Var = this.f39355t;
        if (l0Var == null) {
            C41536l.m120506z("binding");
            l0Var = null;
        }
        LayerView c = l0Var.mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C41536l.m120489i(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        C13305f fVar = this.f39359x;
        if (fVar != null) {
            fVar.onDismiss();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m50047Q1();
        m50049S1();
    }

    /* renamed from: q1 */
    public Dialog mo710q1(Bundle bundle) {
        C0214c.C0215a aVar = new C0214c.C0215a(requireContext());
        C9956l0 d = C9956l0.m36515d(LayoutInflater.from(requireContext()));
        C41536l.m120488h(d, "inflate(LayoutInflater.from(requireContext()))");
        this.f39355t = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        aVar.setView((View) d.mo3946b());
        C0214c create = aVar.create();
        C41536l.m120488h(create, "builder.create()");
        return create;
    }
}
