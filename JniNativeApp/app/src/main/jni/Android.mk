LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_LDLIBS := -L$(SYSROOT)/usr/lib -llog
LOCAL_MODULE    := nativeApplication
LOCAL_SRC_FILES := \
                   	HelloJni.cpp\
                   	Factorial.cpp

include $(BUILD_SHARED_LIBRARY)