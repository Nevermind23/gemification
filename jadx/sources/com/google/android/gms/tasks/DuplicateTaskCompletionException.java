package com.google.android.gms.tasks;

import p337z7.Task;

public final class DuplicateTaskCompletionException extends IllegalStateException {
    private DuplicateTaskCompletionException(String str, Throwable th) {
        super(str, th);
    }

    /* renamed from: a */
    public static IllegalStateException m18560a(Task task) {
        String str;
        if (!task.mo24872q()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception m = task.mo24868m();
        if (m != null) {
            str = "failure";
        } else if (task.mo24873r()) {
            str = "result ".concat(String.valueOf(task.mo24869n()));
        } else if (task.mo24871p()) {
            str = "cancellation";
        } else {
            str = "unknown issue";
        }
        return new DuplicateTaskCompletionException("Complete with: ".concat(str), m);
    }
}
