/*
Copyright 2015 Google Inc. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.google.security.zynamics.binnavi.Gui.Database;

/**
 * Interface for classes that want to be notified about changes in the input panel.
 */
public interface IDatabaseSettingsPanelListener {
  /**
   * Invoked after the input to the panel changed.
   * 
   * @param databaseSettingsPanel The panel whose input changed.
   * @param changed True, to signal that connection settings changed. False, otherwise.
   */
  void changedConnectionSettings(CDatabaseSettingsPanel databaseSettingsPanel, boolean changed);
}
