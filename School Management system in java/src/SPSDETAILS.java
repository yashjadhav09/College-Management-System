
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.WindowEvent;

/**
 * @author ImAakash34
 */
public class SPSDETAILS extends javax.swing.JFrame {

     Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    
    public SPSDETAILS() {
         super("Student List");
        initComponents();
               
        conn=javaconnect.connerDb();
        Update_Table();
       
    }

      public  void close()
    {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
        
    }
     
   
    private void Update_Table(){
        try{
        String sql="select * from  stud";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
  
    }
    catch(Exception e){
          JOptionPane.showMessageDialog(null, e);
        }
            
        }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        label1 = new java.awt.Label();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        mob = new javax.swing.JPanel();
        txt_search = new javax.swing.JTextField();
        roll = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        dept = new javax.swing.JTextField();
        gender = new javax.swing.JTextField();
        Course = new javax.swing.JTextField();
        Year = new javax.swing.JTextField();
        sem = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        dt = new javax.swing.JLabel();
        dt1 = new javax.swing.JLabel();
        dt2 = new javax.swing.JLabel();
        dt3 = new javax.swing.JLabel();
        dt4 = new javax.swing.JLabel();
        dt5 = new javax.swing.JLabel();
        dt6 = new javax.swing.JLabel();
        dt7 = new javax.swing.JLabel();
        dt8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        father = new javax.swing.JTextField();
        mother = new javax.swing.JTextField();
        pc = new javax.swing.JTextField();
        sc = new javax.swing.JTextField();
        dob = new javax.swing.JTextField();
        ct = new javax.swing.JTextField();
        state = new javax.swing.JTextField();
        ad = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 0, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(925, 45));

        jLabel4.setFont(new java.awt.Font("Death Star", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("STUDENT SEARCH");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addContainerGap(259, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        mob.setBackground(new java.awt.Color(255, 255, 255));

        txt_search.setToolTipText("Please Enter Student full Name");
        txt_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txt_searchMouseReleased(evt);
            }
        });
        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });

        roll.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        roll.setForeground(new java.awt.Color(0, 102, 102));
        roll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollActionPerformed(evt);
            }
        });

        fname.setEditable(false);
        fname.setForeground(new java.awt.Color(0, 102, 102));

        dept.setEditable(false);
        dept.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dept.setForeground(new java.awt.Color(0, 102, 102));

        gender.setEditable(false);
        gender.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        gender.setForeground(new java.awt.Color(0, 102, 102));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });

        Course.setEditable(false);
        Course.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Course.setForeground(new java.awt.Color(0, 102, 102));

        Year.setEditable(false);
        Year.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Year.setForeground(new java.awt.Color(0, 102, 102));

        sem.setEditable(false);
        sem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sem.setForeground(new java.awt.Color(0, 102, 102));

        mail.setEditable(false);
        mail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mail.setForeground(new java.awt.Color(0, 102, 102));
        mail.setActionCommand("<Not Set>");

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setForeground(new java.awt.Color(0, 102, 102));
        jPanel5.setPreferredSize(new java.awt.Dimension(0, 1));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jLabel3.setText("Enter Roll No.");

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 204));
        jLabel5.setText("Roll No.");

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 204));
        jLabel6.setText("Name");

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 204));
        jLabel7.setText("Course");

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 204));
        jLabel8.setText("Year");

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 204));
        jLabel10.setText("Sem");

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 0, 204));
        jLabel11.setText("Gender");

        jLabel14.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 0, 204));
        jLabel14.setText("Dept");

        dt.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        dt.setForeground(new java.awt.Color(153, 0, 204));
        dt.setText("Mail");

        dt1.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        dt1.setForeground(new java.awt.Color(153, 0, 204));
        dt1.setText("Father Name");

        dt2.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        dt2.setForeground(new java.awt.Color(153, 0, 204));
        dt2.setText("cast");

        dt3.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        dt3.setForeground(new java.awt.Color(153, 0, 204));
        dt3.setText("Parent Contact");

        dt4.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        dt4.setForeground(new java.awt.Color(153, 0, 204));
        dt4.setText("Student Contact");

        dt5.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        dt5.setForeground(new java.awt.Color(153, 0, 204));
        dt5.setText("DOB");

        dt6.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        dt6.setForeground(new java.awt.Color(153, 0, 204));
        dt6.setText("City");

        dt7.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        dt7.setForeground(new java.awt.Color(153, 0, 204));
        dt7.setText("State");

        dt8.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        dt8.setForeground(new java.awt.Color(153, 0, 204));
        dt8.setText("Address");

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 0, 204));
        jLabel12.setText("        Search Reasult ");

        father.setEditable(false);
        father.setForeground(new java.awt.Color(0, 102, 102));
        father.setMinimumSize(new java.awt.Dimension(7, 21));
        father.setPreferredSize(new java.awt.Dimension(7, 23));

        mother.setEditable(false);
        mother.setForeground(new java.awt.Color(0, 102, 102));
        mother.setMinimumSize(new java.awt.Dimension(7, 21));
        mother.setPreferredSize(new java.awt.Dimension(7, 23));

        pc.setForeground(new java.awt.Color(0, 102, 102));
        pc.setMinimumSize(new java.awt.Dimension(7, 21));
        pc.setPreferredSize(new java.awt.Dimension(7, 23));

        sc.setForeground(new java.awt.Color(0, 102, 102));
        sc.setMinimumSize(new java.awt.Dimension(7, 21));
        sc.setPreferredSize(new java.awt.Dimension(7, 23));

        dob.setEditable(false);
        dob.setForeground(new java.awt.Color(0, 102, 102));
        dob.setMinimumSize(new java.awt.Dimension(7, 21));
        dob.setPreferredSize(new java.awt.Dimension(7, 23));

        ct.setForeground(new java.awt.Color(0, 102, 102));
        ct.setMinimumSize(new java.awt.Dimension(7, 21));
        ct.setPreferredSize(new java.awt.Dimension(7, 23));

        state.setForeground(new java.awt.Color(0, 102, 102));
        state.setMinimumSize(new java.awt.Dimension(7, 21));
        state.setPreferredSize(new java.awt.Dimension(7, 23));

        ad.setForeground(new java.awt.Color(0, 102, 102));
        ad.setMinimumSize(new java.awt.Dimension(7, 21));
        ad.setPreferredSize(new java.awt.Dimension(7, 23));

        jButton2.setBackground(new java.awt.Color(153, 0, 204));
        jButton2.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mobLayout = new javax.swing.GroupLayout(mob);
        mob.setLayout(mobLayout);
        mobLayout.setHorizontalGroup(
            mobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(mobLayout.createSequentialGroup()
                .addGroup(mobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mobLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(mobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mobLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(34, 34, 34)
                                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)))
                    .addGroup(mobLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(mobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mobLayout.createSequentialGroup()
                                .addGroup(mobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dt1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dt2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dt3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dt4)
                                    .addGroup(mobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(dt6)
                                        .addComponent(dt5))
                                    .addGroup(mobLayout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(dt7))
                                    .addComponent(dt8))
                                .addGap(21, 21, 21)
                                .addGroup(mobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(mail, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                    .addComponent(dept)
                                    .addComponent(sem)
                                    .addComponent(Year)
                                    .addComponent(Course)
                                    .addComponent(gender)
                                    .addComponent(fname)
                                    .addComponent(roll)
                                    .addComponent(father, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mother, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(state, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mobLayout.setVerticalGroup(
            mobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mobLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(mobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel12)
                .addGroup(mobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mobLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(mobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Course, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(10, 10, 10)
                        .addGroup(mobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dt)))
                    .addGroup(mobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(roll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(father, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dt1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mother, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dt2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dt3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dt4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dt5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ct, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dt6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dt7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dt8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void rollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rollActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
 
    }//GEN-LAST:event_txt_searchKeyReleased

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed

    private void txt_searchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_searchMouseReleased

    }//GEN-LAST:event_txt_searchMouseReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       try{
            String sql="select  * from  stud where Roll=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1,txt_search.getText());

            rs=pst.executeQuery();

            if(rs.next()){
                String add1=rs.getString("Roll");
                roll.setText(add1);
                String add2=rs.getString("Name");
                fname.setText(add2);
                String add3=rs.getString("Gender");
                gender.setText(add3);
                String add4=rs.getString("Course");
                Course.setText(add4);
                String add5=rs.getString("Year");
                Year.setText(add5);
                String add6=rs.getString("Sem");
                sem.setText(add6);
                String add7=rs.getString("Dept");
                dept.setText(add7);
                String add8=rs.getString("Email");
                mail.setText(add8);
                String add9=rs.getString("Father");
                father.setText(add9);
                String add10=rs.getString("cast");
                mother.setText(add10);
                String add11=rs.getString("fee");
                pc.setText(add11);
                String add12=rs.getString("StudContact");
                sc.setText(add12);
                String add13=rs.getString("DOB");
                dob.setText(add13);
                String add14=rs.getString("City");
                ct.setText(add14);
                String add15=rs.getString("State");
                state.setText(add15);
                String add16=rs.getString("Address");
                ad.setText(add16);
                
              

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No Record Found");

        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Student_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Student_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Course;
    private javax.swing.JTextField Year;
    private javax.swing.JTextField ad;
    private javax.swing.JTextField ct;
    private javax.swing.JTextField dept;
    private javax.swing.JTextField dob;
    private javax.swing.JLabel dt;
    private javax.swing.JLabel dt1;
    private javax.swing.JLabel dt2;
    private javax.swing.JLabel dt3;
    private javax.swing.JLabel dt4;
    private javax.swing.JLabel dt5;
    private javax.swing.JLabel dt6;
    private javax.swing.JLabel dt7;
    private javax.swing.JLabel dt8;
    private javax.swing.JTextField father;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField gender;
    private javax.swing.JButton jButton2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private java.awt.Label label1;
    private javax.swing.JTextField mail;
    private javax.swing.JPanel mob;
    private javax.swing.JTextField mother;
    private javax.swing.JTextField pc;
    private javax.swing.JTextField roll;
    private javax.swing.JTextField sc;
    private javax.swing.JTextField sem;
    private javax.swing.JTextField state;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables

}