package Vistas;

public class ABMTareas extends javax.swing.JInternalFrame {

    public ABMTareas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorPrincipal = new javax.swing.JTabbedPane();
        altaDeTarea = new javax.swing.JPanel();
        altaTareaNombre = new javax.swing.JTextField();
        altaTareaMiembro = new javax.swing.JComboBox<>();
        altaTareaGrupo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        altaTareaDescripcion = new javax.swing.JTextArea();
        btnaltaTareaGuardar = new javax.swing.JButton();
        bajaDeTarea = new javax.swing.JPanel();
        bajaTareaListaMiembro = new javax.swing.JComboBox<>();
        bajaTareaListraGrupo = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        bajaTareaDescripcion = new javax.swing.JTextArea();
        btnBajaTarea = new javax.swing.JButton();
        bajaTareaListaTarea = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        btnUpTareaActualizar = new javax.swing.JButton();
        upTareaListaTareas = new javax.swing.JComboBox<>();
        upTareaListaMiembros = new javax.swing.JComboBox<>();
        upTareaListaGrupos = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        upTareaDescripcionTareas = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        altaTareaNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE"));

        altaTareaMiembro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        altaTareaMiembro.setBorder(javax.swing.BorderFactory.createTitledBorder("MIEMBRO"));

        altaTareaGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        altaTareaGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("GRUPO DE TRABAJO"));

        altaTareaDescripcion.setColumns(20);
        altaTareaDescripcion.setRows(5);
        altaTareaDescripcion.setBorder(javax.swing.BorderFactory.createTitledBorder("DESCRIPCION DE LA TAREA"));
        jScrollPane1.setViewportView(altaTareaDescripcion);

        btnaltaTareaGuardar.setText("Crear Tarea");

        javax.swing.GroupLayout altaDeTareaLayout = new javax.swing.GroupLayout(altaDeTarea);
        altaDeTarea.setLayout(altaDeTareaLayout);
        altaDeTareaLayout.setHorizontalGroup(
            altaDeTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, altaDeTareaLayout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addGroup(altaDeTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(altaTareaNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                    .addGroup(altaDeTareaLayout.createSequentialGroup()
                        .addComponent(altaTareaMiembro, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(altaTareaGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnaltaTareaGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(111, 111, 111))
        );
        altaDeTareaLayout.setVerticalGroup(
            altaDeTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(altaDeTareaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(altaTareaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(altaDeTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(altaTareaMiembro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(altaTareaGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(btnaltaTareaGuardar)
                .addGap(23, 23, 23))
        );

        contenedorPrincipal.addTab("Alta de Tarea", altaDeTarea);

        bajaTareaListaMiembro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        bajaTareaListaMiembro.setBorder(javax.swing.BorderFactory.createTitledBorder("MIEMBRO"));

        bajaTareaListraGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        bajaTareaListraGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("GRUPO DE TRABAJO"));

        bajaTareaDescripcion.setColumns(20);
        bajaTareaDescripcion.setRows(5);
        bajaTareaDescripcion.setBorder(javax.swing.BorderFactory.createTitledBorder("DESCRIPCION DE LA TAREA"));
        jScrollPane2.setViewportView(bajaTareaDescripcion);

        btnBajaTarea.setText("Eliminar Tarea");

        bajaTareaListaTarea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        bajaTareaListaTarea.setBorder(javax.swing.BorderFactory.createTitledBorder("TAREA"));

        javax.swing.GroupLayout bajaDeTareaLayout = new javax.swing.GroupLayout(bajaDeTarea);
        bajaDeTarea.setLayout(bajaDeTareaLayout);
        bajaDeTareaLayout.setHorizontalGroup(
            bajaDeTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bajaDeTareaLayout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addGroup(bajaDeTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bajaTareaListaTarea, 0, 550, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(bajaDeTareaLayout.createSequentialGroup()
                        .addComponent(bajaTareaListaMiembro, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(bajaTareaListraGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBajaTarea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(111, 111, 111))
        );
        bajaDeTareaLayout.setVerticalGroup(
            bajaDeTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bajaDeTareaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bajaTareaListaTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bajaDeTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bajaTareaListaMiembro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bajaTareaListraGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnBajaTarea)
                .addGap(24, 24, 24))
        );

        contenedorPrincipal.addTab("Baja de Tarea", bajaDeTarea);

        btnUpTareaActualizar.setText("Actualizar Tarea");

        upTareaListaTareas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        upTareaListaTareas.setBorder(javax.swing.BorderFactory.createTitledBorder("TAREA"));

        upTareaListaMiembros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        upTareaListaMiembros.setBorder(javax.swing.BorderFactory.createTitledBorder("MIEMBRO"));

        upTareaListaGrupos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        upTareaListaGrupos.setBorder(javax.swing.BorderFactory.createTitledBorder("GRUPO DE TRABAJO"));

        upTareaDescripcionTareas.setColumns(20);
        upTareaDescripcionTareas.setRows(5);
        upTareaDescripcionTareas.setBorder(javax.swing.BorderFactory.createTitledBorder("DESCRIPCION DE LA TAREA"));
        jScrollPane3.setViewportView(upTareaDescripcionTareas);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(upTareaListaTareas, 0, 550, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(upTareaListaMiembros, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(upTareaListaGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnUpTareaActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(111, 111, 111))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(upTareaListaTareas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(upTareaListaMiembros, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(upTareaListaGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnUpTareaActualizar)
                .addGap(24, 24, 24))
        );

        contenedorPrincipal.addTab("Actualizar Tarea", jPanel3);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorPrincipal)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel altaDeTarea;
    private javax.swing.JTextArea altaTareaDescripcion;
    private javax.swing.JComboBox<String> altaTareaGrupo;
    private javax.swing.JComboBox<String> altaTareaMiembro;
    private javax.swing.JTextField altaTareaNombre;
    private javax.swing.JPanel bajaDeTarea;
    private javax.swing.JTextArea bajaTareaDescripcion;
    private javax.swing.JComboBox<String> bajaTareaListaMiembro;
    private javax.swing.JComboBox<String> bajaTareaListaTarea;
    private javax.swing.JComboBox<String> bajaTareaListraGrupo;
    private javax.swing.JButton btnBajaTarea;
    private javax.swing.JButton btnUpTareaActualizar;
    private javax.swing.JButton btnaltaTareaGuardar;
    private javax.swing.JTabbedPane contenedorPrincipal;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea upTareaDescripcionTareas;
    private javax.swing.JComboBox<String> upTareaListaGrupos;
    private javax.swing.JComboBox<String> upTareaListaMiembros;
    private javax.swing.JComboBox<String> upTareaListaTareas;
    // End of variables declaration//GEN-END:variables
}