package p341ge.bog.chatkit.dialogs;

import android.support.p013v4.media.session.C0125b;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Keep;
import java.util.Date;
import p545og.C17194e;
import p559pg.C17345a;
import p573qg.C17498a;
import p587rg.C17612a;

@Keep
/* renamed from: ge.bog.chatkit.dialogs.DialogsListAdapter$DialogViewHolder */
public class DialogsListAdapter$DialogViewHolder<DIALOG extends C17498a> extends DialogsListAdapter$BaseDialogViewHolder<DIALOG> {
    protected ViewGroup container;
    protected C13097a dialogStyle;
    protected View divider;
    protected ViewGroup dividerContainer;
    protected ImageView ivAvatar;
    protected ImageView ivLastMessageUser;
    protected ViewGroup root;
    protected TextView tvBubble;
    protected TextView tvDate;
    protected TextView tvLastMessage;
    protected TextView tvName;

    public DialogsListAdapter$DialogViewHolder(View view) {
        super(view);
        this.root = (ViewGroup) view.findViewById(C17194e.dialogRootLayout);
        this.container = (ViewGroup) view.findViewById(C17194e.dialogContainer);
        this.tvName = (TextView) view.findViewById(C17194e.dialogName);
        this.tvDate = (TextView) view.findViewById(C17194e.dialogDate);
        this.tvLastMessage = (TextView) view.findViewById(C17194e.dialogLastMessage);
        this.tvBubble = (TextView) view.findViewById(C17194e.dialogUnreadBubble);
        this.ivLastMessageUser = (ImageView) view.findViewById(C17194e.dialogLastMessageUserAvatar);
        this.ivAvatar = (ImageView) view.findViewById(C17194e.dialogAvatar);
        this.dividerContainer = (ViewGroup) view.findViewById(C17194e.dialogDividerContainer);
        this.divider = view.findViewById(C17194e.dialogDivider);
    }

    private void applyDefaultStyle() {
    }

    private void applyStyle() {
    }

    private void applyUnreadStyle() {
    }

    /* access modifiers changed from: protected */
    public String getDateString(Date date) {
        return C17612a.m61245b(date, C17612a.C17614b.TIME);
    }

    /* access modifiers changed from: protected */
    public C13097a getDialogStyle() {
        return null;
    }

    public /* bridge */ /* synthetic */ void onBind(Object obj) {
        C0125b.m366a(obj);
        onBind((C17498a) null);
    }

    /* access modifiers changed from: protected */
    public void setDialogStyle(C13097a aVar) {
        applyStyle();
    }

    public void onBind(DIALOG dialog) {
        if (dialog.mo45015b() > 0) {
            applyUnreadStyle();
        } else {
            applyDefaultStyle();
        }
        this.tvName.setText(dialog.mo45014a());
        if (dialog.mo45017d() != null) {
            Date c = dialog.mo45017d().mo34286c();
            C17612a.C17613a aVar = this.datesFormatter;
            String a = aVar != null ? aVar.mo34345a(c) : null;
            TextView textView = this.tvDate;
            if (a == null) {
                a = getDateString(c);
            }
            textView.setText(a);
        } else {
            this.tvDate.setText((CharSequence) null);
        }
        C17345a aVar2 = this.imageLoader;
        if (aVar2 != null) {
            aVar2.mo34322a(this.ivAvatar, dialog.mo45016c(), (Object) null);
        }
        if (!(this.imageLoader == null || dialog.mo45017d() == null)) {
            this.imageLoader.mo34322a(this.ivLastMessageUser, dialog.mo45017d().mo34287d().mo34235b(), (Object) null);
        }
        throw null;
    }
}
