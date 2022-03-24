/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Report.java
 *
 * Created on Aug 1, 2010, 6:29:17 PM
 */

/**
 *
 * @author megha
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class Report extends javax.swing.JFrame {

    /** Creates new form Report */
    public Report() {
        initComponents();
        Entry4ResStatusPanel.setVisible(false);
        Entry4BillPanel.setVisible(false);
        Entry4ResSlipPanel.setVisible(false);
        ReportingOptionsPanel.setVisible(true);
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reportTopPanel = new javax.swing.JPanel();
        ReportingOptionsPanel = new javax.swing.JPanel();
        StatusBTN = new javax.swing.JButton();
        RSlipBTN = new javax.swing.JButton();
        BillBTN = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Entry4BillPanel = new javax.swing.JPanel();
        error2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BokingNo4BillTF = new javax.swing.JTextField();
        GenerateBillBTN = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Entry4ResSlipPanel = new javax.swing.JPanel();
        GenerateResSlipBTN = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        BokingNo4ResSlipTF = new javax.swing.JTextField();
        error1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Entry4ResStatusPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        SearchBTN = new javax.swing.JButton();
        error = new javax.swing.JLabel();
        MonthCB = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        repMnuBar = new javax.swing.JMenuBar();
        ViewMnu = new javax.swing.JMenu();
        view_StatusMItem = new javax.swing.JMenuItem();
        view_ResSlipMItem = new javax.swing.JMenuItem();
        view_BillMItem = new javax.swing.JMenuItem();
        BackMnu = new javax.swing.JMenu();
        back_MainMenuMItem = new javax.swing.JMenuItem();
        back_LogoutMItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        reportTopPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        reportTopPanel.setMaximumSize(new java.awt.Dimension(214747, 214647));
        reportTopPanel.setLayout(new java.awt.CardLayout());

        StatusBTN.setText("<HTML>Reservation<br>Status</HTML>");
        StatusBTN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        StatusBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusBTNActionPerformed(evt);
            }
        });

        RSlipBTN.setText("<HTML>Reservation<br>Slip</HTML>");
        RSlipBTN.setAlignmentY(0.3F);
        RSlipBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RSlipBTNActionPerformed(evt);
            }
        });

        BillBTN.setText("Bill");
        BillBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillBTNActionPerformed(evt);
            }
        });

        Back.setText("<< Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel1.setText("GENERATE REPORTS");

        javax.swing.GroupLayout ReportingOptionsPanelLayout = new javax.swing.GroupLayout(ReportingOptionsPanel);
        ReportingOptionsPanel.setLayout(ReportingOptionsPanelLayout);
        ReportingOptionsPanelLayout.setHorizontalGroup(
            ReportingOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReportingOptionsPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(ReportingOptionsPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(ReportingOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ReportingOptionsPanelLayout.createSequentialGroup()
                        .addComponent(StatusBTN)
                        .addGap(30, 30, 30)
                        .addComponent(BillBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(RSlipBTN))
                    .addGroup(ReportingOptionsPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Back)))
                .addGap(31, 31, 31))
        );
        ReportingOptionsPanelLayout.setVerticalGroup(
            ReportingOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReportingOptionsPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addGroup(ReportingOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(StatusBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RSlipBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BillBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        reportTopPanel.add(ReportingOptionsPanel, "card4");

        error2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        error2.setText("           ");
        error2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ENTER BOOKING NUMBER");

        GenerateBillBTN.setText("Generate Bill");
        GenerateBillBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateBillBTNActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TO GENERATE BILL");

        javax.swing.GroupLayout Entry4BillPanelLayout = new javax.swing.GroupLayout(Entry4BillPanel);
        Entry4BillPanel.setLayout(Entry4BillPanelLayout);
        Entry4BillPanelLayout.setHorizontalGroup(
            Entry4BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Entry4BillPanelLayout.createSequentialGroup()
                .addGroup(Entry4BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Entry4BillPanelLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Entry4BillPanelLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(Entry4BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BokingNo4BillTF, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GenerateBillBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE))
                    .addComponent(error2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE))
                .addContainerGap())
        );
        Entry4BillPanelLayout.setVerticalGroup(
            Entry4BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Entry4BillPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(35, 35, 35)
                .addComponent(BokingNo4BillTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(GenerateBillBTN)
                .addGap(33, 33, 33)
                .addComponent(error2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        reportTopPanel.add(Entry4BillPanel, "card4");

        Entry4ResSlipPanel.setMaximumSize(new java.awt.Dimension(367, 367));
        Entry4ResSlipPanel.setPreferredSize(new java.awt.Dimension(87, 104));

        GenerateResSlipBTN.setText("Get Reservation Slip");
        GenerateResSlipBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateResSlipBTNActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("ENTER BOOKING NUMBER");

        BokingNo4ResSlipTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BokingNo4ResSlipTFActionPerformed(evt);
            }
        });

        error1.setText("           ");
        error1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16));
        jLabel7.setText("TO GENERATE RESERVATION SLIP");

        javax.swing.GroupLayout Entry4ResSlipPanelLayout = new javax.swing.GroupLayout(Entry4ResSlipPanel);
        Entry4ResSlipPanel.setLayout(Entry4ResSlipPanelLayout);
        Entry4ResSlipPanelLayout.setHorizontalGroup(
            Entry4ResSlipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Entry4ResSlipPanelLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addGap(85, 85, 85))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Entry4ResSlipPanelLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel7)
                .addGap(57, 57, 57))
            .addGroup(Entry4ResSlipPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(error1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(Entry4ResSlipPanelLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(Entry4ResSlipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(GenerateResSlipBTN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BokingNo4ResSlipTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        Entry4ResSlipPanelLayout.setVerticalGroup(
            Entry4ResSlipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Entry4ResSlipPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(36, 36, 36)
                .addComponent(BokingNo4ResSlipTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(GenerateResSlipBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(error1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        reportTopPanel.add(Entry4ResSlipPanel, "card3");

        Entry4ResStatusPanel.setMaximumSize(new java.awt.Dimension(277, 200));
        Entry4ResStatusPanel.setMinimumSize(new java.awt.Dimension(100, 100));
        Entry4ResStatusPanel.setPreferredSize(new java.awt.Dimension(228, 200));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("OF MONTH :");

        SearchBTN.setText("Search");
        SearchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBTNActionPerformed(evt);
            }
        });

        error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        error.setText("           ");
        error.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        MonthCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("RESERVATION STATUS");

        javax.swing.GroupLayout Entry4ResStatusPanelLayout = new javax.swing.GroupLayout(Entry4ResStatusPanel);
        Entry4ResStatusPanel.setLayout(Entry4ResStatusPanelLayout);
        Entry4ResStatusPanelLayout.setHorizontalGroup(
            Entry4ResStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Entry4ResStatusPanelLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Entry4ResStatusPanelLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(Entry4ResStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MonthCB, javax.swing.GroupLayout.Alignment.LEADING, 0, 119, Short.MAX_VALUE)
                    .addComponent(SearchBTN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(130, 130, 130))
            .addGroup(Entry4ResStatusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(error, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addContainerGap())
        );
        Entry4ResStatusPanelLayout.setVerticalGroup(
            Entry4ResStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Entry4ResStatusPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(MonthCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(SearchBTN)
                .addGap(27, 27, 27)
                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        reportTopPanel.add(Entry4ResStatusPanel, "card2");

        repMnuBar.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        repMnuBar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ViewMnu.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        ViewMnu.setText("View");
        ViewMnu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewMnu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ViewMnu.setPreferredSize(new java.awt.Dimension(50, 19));

        view_StatusMItem.setText("Status");
        view_StatusMItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_StatusMItemActionPerformed(evt);
            }
        });
        ViewMnu.add(view_StatusMItem);

        view_ResSlipMItem.setText("Reservation slip");
        view_ResSlipMItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_ResSlipMItemActionPerformed(evt);
            }
        });
        ViewMnu.add(view_ResSlipMItem);

        view_BillMItem.setText("Bill");
        view_BillMItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_BillMItemActionPerformed(evt);
            }
        });
        ViewMnu.add(view_BillMItem);

        repMnuBar.add(ViewMnu);

        BackMnu.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        BackMnu.setText("Back");
        BackMnu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BackMnu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BackMnu.setPreferredSize(new java.awt.Dimension(50, 19));

        back_MainMenuMItem.setText("Main Menu");
        back_MainMenuMItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_MainMenuMItemActionPerformed(evt);
            }
        });
        BackMnu.add(back_MainMenuMItem);

        back_LogoutMItem.setText("Logout");
        back_LogoutMItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_LogoutMItemActionPerformed(evt);
            }
        });
        BackMnu.add(back_LogoutMItem);

        repMnuBar.add(BackMnu);

        setJMenuBar(repMnuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reportTopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reportTopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBTNActionPerformed
        // TODO add your handling code here:
        int month = Integer.parseInt(MonthCB.getSelectedItem().toString());
        new Status(month).setVisible(true);
        //this.setVisible(false);
}//GEN-LAST:event_SearchBTNActionPerformed
private boolean search(int bno)
{
     try {
            Class.forName("java.sql.Driver");
            String database = "jdbc:mysql://localhost:3306/Hotel";
            Connection conn = DriverManager.getConnection(database, "root", "pace");
            Statement stmt = conn.createStatement();
            String sql = "select * from Booking where BookingNo = " + bno;
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
               return true;
            }
            else
            {
                return false;
            }
        } catch (Exception e) { JOptionPane.showMessageDialog(null,"" + e);
        return false; }
}
private void GenerateResSlipBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateResSlipBTNActionPerformed
        // TODO add your handling code here:
        int bno = Integer.parseInt( BokingNo4ResSlipTF.getText());
       if(search(bno))
       {
            new ReservaTionSlip(bno).setVisible(true);
            this.setVisible(false);
       }
       else
       {
           error1.setText("Unable to fine Booking number");
       }
}//GEN-LAST:event_GenerateResSlipBTNActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        MainMenu m = new MainMenu();
        m.setVisible(true);
        this.setVisible(false);
}//GEN-LAST:event_BackActionPerformed

    private void StatusBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusBTNActionPerformed
        // TODO add your handling code here:
        Entry4ResSlipPanel.setVisible(false);
         Entry4BillPanel.setVisible(false);
        ReportingOptionsPanel.setVisible(false);
        Entry4ResStatusPanel.setVisible(true);
}//GEN-LAST:event_StatusBTNActionPerformed

    private void RSlipBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RSlipBTNActionPerformed
        // TODO add your handling code here:
        Entry4ResStatusPanel.setVisible(false);
         Entry4BillPanel.setVisible(false);
        ReportingOptionsPanel.setVisible(false);
        Entry4ResSlipPanel.setVisible(true);
}//GEN-LAST:event_RSlipBTNActionPerformed

    private void BillBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillBTNActionPerformed
        // TODO add your handling code here:
        Entry4ResStatusPanel.setVisible(false);
         ReportingOptionsPanel.setVisible(false);
        Entry4ResSlipPanel.setVisible(false);
        Entry4BillPanel.setVisible(true);
}//GEN-LAST:event_BillBTNActionPerformed

    private void GenerateBillBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateBillBTNActionPerformed
        // TODO add your handling code here:
                        int bno = Integer.parseInt( BokingNo4BillTF.getText());
       if(search(bno))
       {
           new Bill(bno).setVisible(true);
           this.setVisible(false);
       }
       else
       {
             error2.setText("Unable to fine Booking number");
       }
}//GEN-LAST:event_GenerateBillBTNActionPerformed

    private void back_MainMenuMItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_MainMenuMItemActionPerformed
        // TODO add your handling code here:
        MainMenu m = new MainMenu();
        m.setVisible(true);
        this.setVisible(false);
}//GEN-LAST:event_back_MainMenuMItemActionPerformed

    private void back_LogoutMItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_LogoutMItemActionPerformed
        // TODO add your handling code here:
        new login().setVisible(true);
        this.setVisible(false);
}//GEN-LAST:event_back_LogoutMItemActionPerformed

    private void view_StatusMItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_StatusMItemActionPerformed
        Entry4ResSlipPanel.setVisible(false);
        Entry4BillPanel.setVisible(false);
        ReportingOptionsPanel.setVisible(false);
        Entry4ResStatusPanel.setVisible(true);
}//GEN-LAST:event_view_StatusMItemActionPerformed

    private void view_ResSlipMItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_ResSlipMItemActionPerformed
        Entry4ResStatusPanel.setVisible(false);
        ReportingOptionsPanel.setVisible(false);
        Entry4BillPanel.setVisible(false);
        Entry4ResSlipPanel.setVisible(true);
}//GEN-LAST:event_view_ResSlipMItemActionPerformed

    private void view_BillMItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_BillMItemActionPerformed
        Entry4ResStatusPanel.setVisible(false);
         ReportingOptionsPanel.setVisible(false);
        Entry4ResSlipPanel.setVisible(false);
        Entry4BillPanel.setVisible(true);
}//GEN-LAST:event_view_BillMItemActionPerformed

    private void BokingNo4ResSlipTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BokingNo4ResSlipTFActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_BokingNo4ResSlipTFActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JMenu BackMnu;
    private javax.swing.JButton BillBTN;
    private javax.swing.JTextField BokingNo4BillTF;
    private javax.swing.JTextField BokingNo4ResSlipTF;
    private javax.swing.JPanel Entry4BillPanel;
    private javax.swing.JPanel Entry4ResSlipPanel;
    private javax.swing.JPanel Entry4ResStatusPanel;
    private javax.swing.JButton GenerateBillBTN;
    private javax.swing.JButton GenerateResSlipBTN;
    private javax.swing.JComboBox MonthCB;
    private javax.swing.JButton RSlipBTN;
    private javax.swing.JPanel ReportingOptionsPanel;
    private javax.swing.JButton SearchBTN;
    private javax.swing.JButton StatusBTN;
    private javax.swing.JMenu ViewMnu;
    private javax.swing.JMenuItem back_LogoutMItem;
    private javax.swing.JMenuItem back_MainMenuMItem;
    private javax.swing.JLabel error;
    private javax.swing.JLabel error1;
    private javax.swing.JLabel error2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar repMnuBar;
    private javax.swing.JPanel reportTopPanel;
    private javax.swing.JMenuItem view_BillMItem;
    private javax.swing.JMenuItem view_ResSlipMItem;
    private javax.swing.JMenuItem view_StatusMItem;
    // End of variables declaration//GEN-END:variables

}
