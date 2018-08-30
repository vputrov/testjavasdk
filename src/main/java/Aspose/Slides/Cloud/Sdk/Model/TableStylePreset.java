/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose">
 *   Copyright (c) 2018 Aspose.Slides for Cloud
 * </copyright>
 * <summary>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */

package Aspose.Slides.Cloud.Sdk.Model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * 
 */
@JsonAdapter(TableStylePreset.Adapter.class)
public enum TableStylePreset {
  
  NONE("None"),
  
  MEDIUMSTYLE2ACCENT1("MediumStyle2Accent1"),
  
  MEDIUMSTYLE2("MediumStyle2"),
  
  NOSTYLENOGRID("NoStyleNoGrid"),
  
  THEMEDSTYLE1ACCENT1("ThemedStyle1Accent1"),
  
  THEMEDSTYLE1ACCENT2("ThemedStyle1Accent2"),
  
  THEMEDSTYLE1ACCENT3("ThemedStyle1Accent3"),
  
  THEMEDSTYLE1ACCENT4("ThemedStyle1Accent4"),
  
  THEMEDSTYLE1ACCENT5("ThemedStyle1Accent5"),
  
  THEMEDSTYLE1ACCENT6("ThemedStyle1Accent6"),
  
  NOSTYLETABLEGRID("NoStyleTableGrid"),
  
  THEMEDSTYLE2ACCENT1("ThemedStyle2Accent1"),
  
  THEMEDSTYLE2ACCENT2("ThemedStyle2Accent2"),
  
  THEMEDSTYLE2ACCENT3("ThemedStyle2Accent3"),
  
  THEMEDSTYLE2ACCENT4("ThemedStyle2Accent4"),
  
  THEMEDSTYLE2ACCENT5("ThemedStyle2Accent5"),
  
  THEMEDSTYLE2ACCENT6("ThemedStyle2Accent6"),
  
  LIGHTSTYLE1("LightStyle1"),
  
  LIGHTSTYLE1ACCENT1("LightStyle1Accent1"),
  
  LIGHTSTYLE1ACCENT2("LightStyle1Accent2"),
  
  LIGHTSTYLE1ACCENT3("LightStyle1Accent3"),
  
  LIGHTSTYLE1ACCENT4("LightStyle1Accent4"),
  
  LIGHTSTYLE2ACCENT5("LightStyle2Accent5"),
  
  LIGHTSTYLE1ACCENT6("LightStyle1Accent6"),
  
  LIGHTSTYLE2("LightStyle2"),
  
  LIGHTSTYLE2ACCENT1("LightStyle2Accent1"),
  
  LIGHTSTYLE2ACCENT2("LightStyle2Accent2"),
  
  LIGHTSTYLE2ACCENT3("LightStyle2Accent3"),
  
  MEDIUMSTYLE2ACCENT3("MediumStyle2Accent3"),
  
  MEDIUMSTYLE2ACCENT4("MediumStyle2Accent4"),
  
  MEDIUMSTYLE2ACCENT5("MediumStyle2Accent5"),
  
  LIGHTSTYLE2ACCENT6("LightStyle2Accent6"),
  
  LIGHTSTYLE2ACCENT4("LightStyle2Accent4"),
  
  LIGHTSTYLE3("LightStyle3"),
  
  LIGHTSTYLE3ACCENT1("LightStyle3Accent1"),
  
  MEDIUMSTYLE2ACCENT2("MediumStyle2Accent2"),
  
  LIGHTSTYLE3ACCENT2("LightStyle3Accent2"),
  
  LIGHTSTYLE3ACCENT3("LightStyle3Accent3"),
  
  LIGHTSTYLE3ACCENT4("LightStyle3Accent4"),
  
  LIGHTSTYLE3ACCENT5("LightStyle3Accent5"),
  
  LIGHTSTYLE3ACCENT6("LightStyle3Accent6"),
  
  MEDIUMSTYLE1("MediumStyle1"),
  
  MEDIUMSTYLE1ACCENT1("MediumStyle1Accent1"),
  
  MEDIUMSTYLE1ACCENT2("MediumStyle1Accent2"),
  
  MEDIUMSTYLE1ACCENT3("MediumStyle1Accent3"),
  
  MEDIUMSTYLE1ACCENT4("MediumStyle1Accent4"),
  
  MEDIUMSTYLE1ACCENT5("MediumStyle1Accent5"),
  
  MEDIUMSTYLE1ACCENT6("MediumStyle1Accent6"),
  
  MEDIUMSTYLE2ACCENT6("MediumStyle2Accent6"),
  
  MEDIUMSTYLE3("MediumStyle3"),
  
  MEDIUMSTYLE3ACCENT1("MediumStyle3Accent1"),
  
  MEDIUMSTYLE3ACCENT2("MediumStyle3Accent2"),
  
  MEDIUMSTYLE3ACCENT3("MediumStyle3Accent3"),
  
  MEDIUMSTYLE3ACCENT4("MediumStyle3Accent4"),
  
  MEDIUMSTYLE3ACCENT5("MediumStyle3Accent5"),
  
  MEDIUMSTYLE3ACCENT6("MediumStyle3Accent6"),
  
  MEDIUMSTYLE4("MediumStyle4"),
  
  MEDIUMSTYLE4ACCENT1("MediumStyle4Accent1"),
  
  MEDIUMSTYLE4ACCENT2("MediumStyle4Accent2"),
  
  MEDIUMSTYLE4ACCENT3("MediumStyle4Accent3"),
  
  MEDIUMSTYLE4ACCENT4("MediumStyle4Accent4"),
  
  MEDIUMSTYLE4ACCENT5("MediumStyle4Accent5"),
  
  MEDIUMSTYLE4ACCENT6("MediumStyle4Accent6"),
  
  DARKSTYLE1("DarkStyle1"),
  
  DARKSTYLE1ACCENT1("DarkStyle1Accent1"),
  
  DARKSTYLE1ACCENT2("DarkStyle1Accent2"),
  
  DARKSTYLE1ACCENT3("DarkStyle1Accent3"),
  
  DARKSTYLE1ACCENT4("DarkStyle1Accent4"),
  
  DARKSTYLE1ACCENT5("DarkStyle1Accent5"),
  
  DARKSTYLE1ACCENT6("DarkStyle1Accent6"),
  
  DARKSTYLE2("DarkStyle2"),
  
  DARKSTYLE2ACCENT1ACCENT2("DarkStyle2Accent1Accent2"),
  
  DARKSTYLE2ACCENT3ACCENT4("DarkStyle2Accent3Accent4"),
  
  DARKSTYLE2ACCENT5ACCENT6("DarkStyle2Accent5Accent6"),
  
  CUSTOM("Custom");

  private String value;

  TableStylePreset(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static TableStylePreset fromValue(String text) {
    for (TableStylePreset b : TableStylePreset.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<TableStylePreset> {
    @Override
    public void write(final JsonWriter jsonWriter, final TableStylePreset enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TableStylePreset read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TableStylePreset.fromValue(String.valueOf(value));
    }
  }
}

