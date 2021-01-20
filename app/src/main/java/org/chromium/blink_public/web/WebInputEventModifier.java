
// Copyright 2019 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../third_party/blink/public/platform/web_input_event.h

package org.chromium.blink_public.web;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    WebInputEventModifier.SHIFT_KEY, WebInputEventModifier.CONTROL_KEY,
    WebInputEventModifier.ALT_KEY, WebInputEventModifier.META_KEY, WebInputEventModifier.IS_KEY_PAD,
    WebInputEventModifier.IS_AUTO_REPEAT, WebInputEventModifier.LEFT_BUTTON_DOWN,
    WebInputEventModifier.MIDDLE_BUTTON_DOWN, WebInputEventModifier.RIGHT_BUTTON_DOWN,
    WebInputEventModifier.CAPS_LOCK_ON, WebInputEventModifier.NUM_LOCK_ON,
    WebInputEventModifier.IS_LEFT, WebInputEventModifier.IS_RIGHT,
    WebInputEventModifier.IS_TOUCH_ACCESSIBILITY, WebInputEventModifier.IS_COMPOSING,
    WebInputEventModifier.ALT_GR_KEY, WebInputEventModifier.FN_KEY,
    WebInputEventModifier.SYMBOL_KEY, WebInputEventModifier.SCROLL_LOCK_ON,
    WebInputEventModifier.IS_COMPATIBILITY_EVENT_FOR_TOUCH, WebInputEventModifier.BACK_BUTTON_DOWN,
    WebInputEventModifier.FORWARD_BUTTON_DOWN, WebInputEventModifier.RELATIVE_MOTION_EVENT,
    WebInputEventModifier.FROM_DEBUGGER, WebInputEventModifier.KEY_MODIFIERS,
    WebInputEventModifier.NO_MODIFIERS
})
@Retention(RetentionPolicy.SOURCE)
public @interface WebInputEventModifier {
  /**
   * modifiers for all events:
   */
  int SHIFT_KEY = 1 << 0;
  int CONTROL_KEY = 1 << 1;
  int ALT_KEY = 1 << 2;
  int META_KEY = 1 << 3;
  /**
   * modifiers for keyboard events:
   */
  int IS_KEY_PAD = 1 << 4;
  int IS_AUTO_REPEAT = 1 << 5;
  /**
   * modifiers for mouse events:
   */
  int LEFT_BUTTON_DOWN = 1 << 6;
  int MIDDLE_BUTTON_DOWN = 1 << 7;
  int RIGHT_BUTTON_DOWN = 1 << 8;
  /**
   * Toggle modifers for all events.
   */
  int CAPS_LOCK_ON = 1 << 9;
  int NUM_LOCK_ON = 1 << 10;
  int IS_LEFT = 1 << 11;
  int IS_RIGHT = 1 << 12;
  /**
   * Indicates that an event was generated on the touch screen while touch accessibility is enabled,
   * so the event should be handled by accessibility code first before normal input event
   * processing.
   */
  int IS_TOUCH_ACCESSIBILITY = 1 << 13;
  int IS_COMPOSING = 1 << 14;
  int ALT_GR_KEY = 1 << 15;
  int FN_KEY = 1 << 16;
  int SYMBOL_KEY = 1 << 17;
  int SCROLL_LOCK_ON = 1 << 18;
  /**
   * Whether this is a compatibility event generated due to a native touch event. Mouse events
   * generated from touch events will set this.
   */
  int IS_COMPATIBILITY_EVENT_FOR_TOUCH = 1 << 19;
  int BACK_BUTTON_DOWN = 1 << 20;
  int FORWARD_BUTTON_DOWN = 1 << 21;
  /**
   * Represents movement as a result of content changing under the cursor, not actual physical
   * movement of the pointer
   */
  int RELATIVE_MOTION_EVENT = 1 << 22;
  /**
   * Indication this event was injected by the devtools. TODO(dtapuska): Remove this flag once we
   * are able to bind callbacks in event sending.
   */
  int FROM_DEBUGGER = 1 << 23;
  /**
   * The set of non-stateful modifiers that specifically change the interpretation of the key being
   * pressed. For example; IsLeft, IsRight, IsComposing don't change the meaning of the key being
   * pressed. NumLockOn, ScrollLockOn, CapsLockOn are stateful and don't indicate explicit depressed
   * state.
   */
  int KEY_MODIFIERS = SYMBOL_KEY | FN_KEY | ALT_GR_KEY | META_KEY | ALT_KEY | CONTROL_KEY | SHIFT_KEY;
  int NO_MODIFIERS = 0;
}
