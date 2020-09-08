package com.mobon.commit;

import com.intellij.ide.util.PropertiesComponent;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CommitPannel {

  private JComboBox<String> mTypeComboBox;
  private JTextArea mDetailField;
  private JPanel mainPanel;
  private List<String> versionFieldList = new ArrayList<>(2);

  public CommitPannel() {
    for (ChangeType type : ChangeType.values()) {
      mTypeComboBox.addItem(type.getTitle());
    }
    String[] versionFields = PropertiesComponent.getInstance().getValues("VersionFields");
    if (versionFields != null) {
      versionFieldList = Arrays.asList(versionFields);
      Collections.reverse(versionFieldList);
    }
  }


  public JPanel getMainPanel() {
    return mainPanel;
  }


  public CommitMessage getCommitMessage() {
    return new CommitMessage(
            mTypeComboBox.getSelectedItem(),
            mDetailField.getText().trim());
  }
}
