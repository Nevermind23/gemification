package com.medallia.digital.mobilesdk;

import java.lang.reflect.Field;
import java.util.List;

/* renamed from: com.medallia.digital.mobilesdk.i0 */
public class C10875i0 {
    private void handleUseCases(Field field) {
        if (field.get(this) instanceof C10875i0) {
            ((C10875i0) field.get(this)).validateFields();
        } else if (field.get(this) instanceof List) {
            for (Object next : (List) field.get(this)) {
                if (next instanceof C10875i0) {
                    ((C10875i0) next).validateFields();
                }
            }
        }
    }

    public void validateFields() {
        for (Field field : getClass().getDeclaredFields()) {
            try {
                field.setAccessible(true);
                if (field.get(this) == null) {
                    C10735b4.m39114f(field.getName() + " data is missing");
                } else {
                    handleUseCases(field);
                }
            } catch (IllegalAccessException e) {
                C10735b4.m39111c(e.getMessage());
            } catch (Throwable th) {
                field.setAccessible(false);
                throw th;
            }
            field.setAccessible(false);
        }
    }
}
