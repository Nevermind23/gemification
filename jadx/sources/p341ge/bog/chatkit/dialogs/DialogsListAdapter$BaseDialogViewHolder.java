package p341ge.bog.chatkit.dialogs;

import android.view.View;
import androidx.annotation.Keep;
import p341ge.bog.chatkit.commons.ViewHolder;
import p559pg.C17345a;
import p573qg.C17498a;
import p587rg.C17612a;

@Keep
/* renamed from: ge.bog.chatkit.dialogs.DialogsListAdapter$BaseDialogViewHolder */
public abstract class DialogsListAdapter$BaseDialogViewHolder<DIALOG extends C17498a> extends ViewHolder<DIALOG> {
    protected C17612a.C17613a datesFormatter;
    protected C17345a imageLoader;
    protected C13098b onDialogClickListener;
    protected C13100d onDialogViewClickListener;
    protected C13101e onDialogViewLongClickListener;
    protected C13099c onLongItemClickListener;

    public DialogsListAdapter$BaseDialogViewHolder(View view) {
        super(view);
    }

    public void setDatesFormatter(C17612a.C17613a aVar) {
        this.datesFormatter = aVar;
    }

    /* access modifiers changed from: package-private */
    public void setImageLoader(C17345a aVar) {
        this.imageLoader = aVar;
    }

    /* access modifiers changed from: protected */
    public void setOnDialogClickListener(C13098b bVar) {
    }

    /* access modifiers changed from: protected */
    public void setOnDialogViewClickListener(C13100d dVar) {
    }

    /* access modifiers changed from: protected */
    public void setOnDialogViewLongClickListener(C13101e eVar) {
    }

    /* access modifiers changed from: protected */
    public void setOnLongItemClickListener(C13099c cVar) {
    }
}
