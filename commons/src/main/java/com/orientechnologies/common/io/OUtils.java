/*
 * Copyright 2010-2012 Luca Garulli (l.garulli--at--orientechnologies.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.orientechnologies.common.io;

public class OUtils {
  public static boolean equals(final Object a, final Object b) {
    if (a == b)
      return true;

    if (a != null)
      return a.equals(b);
    return b.equals(a);
  }

  public static String camelCase(final String iText) {
    if (iText == null || iText.length() == 0)
      return null;

    if (Character.isUpperCase(iText.charAt(0)))
      // ALREADY CAMELIZED
      return iText;

    if (iText.length() == 1)
      // ONE CHARACTER, UPPER CASE ALL
      return iText.toUpperCase();

    return Character.toUpperCase(iText.charAt(0)) + iText.substring(1);
  }
}
