package p341ge.bog.mobilebank.model;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.toastnotification.ToastNotificationArguments;

/* renamed from: ge.bog.mobilebank.model.ToastNotificationArgumentsWrapper */
public final class ToastNotificationArgumentsWrapper {
    private final ToastNotificationArguments arguments;
    private final String copiedText;

    public ToastNotificationArgumentsWrapper() {
        this((ToastNotificationArguments) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ToastNotificationArgumentsWrapper copy$default(ToastNotificationArgumentsWrapper toastNotificationArgumentsWrapper, ToastNotificationArguments toastNotificationArguments, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            toastNotificationArguments = toastNotificationArgumentsWrapper.arguments;
        }
        if ((i & 2) != 0) {
            str = toastNotificationArgumentsWrapper.copiedText;
        }
        return toastNotificationArgumentsWrapper.copy(toastNotificationArguments, str);
    }

    public final ToastNotificationArguments component1() {
        return this.arguments;
    }

    public final String component2() {
        return this.copiedText;
    }

    public final ToastNotificationArgumentsWrapper copy(ToastNotificationArguments toastNotificationArguments, String str) {
        return new ToastNotificationArgumentsWrapper(toastNotificationArguments, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToastNotificationArgumentsWrapper)) {
            return false;
        }
        ToastNotificationArgumentsWrapper toastNotificationArgumentsWrapper = (ToastNotificationArgumentsWrapper) obj;
        return C41536l.m120484d(this.arguments, toastNotificationArgumentsWrapper.arguments) && C41536l.m120484d(this.copiedText, toastNotificationArgumentsWrapper.copiedText);
    }

    public final ToastNotificationArguments getArguments() {
        return this.arguments;
    }

    public final String getCopiedText() {
        return this.copiedText;
    }

    public int hashCode() {
        ToastNotificationArguments toastNotificationArguments = this.arguments;
        int i = 0;
        int hashCode = (toastNotificationArguments == null ? 0 : toastNotificationArguments.hashCode()) * 31;
        String str = this.copiedText;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        ToastNotificationArguments toastNotificationArguments = this.arguments;
        String str = this.copiedText;
        return "ToastNotificationArgumentsWrapper(arguments=" + toastNotificationArguments + ", copiedText=" + str + ")";
    }

    public ToastNotificationArgumentsWrapper(ToastNotificationArguments toastNotificationArguments, String str) {
        this.arguments = toastNotificationArguments;
        this.copiedText = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ToastNotificationArgumentsWrapper(ToastNotificationArguments toastNotificationArguments, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : toastNotificationArguments, (i & 2) != 0 ? null : str);
    }
}
