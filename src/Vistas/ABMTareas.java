package Vistas;

import Modelo.Equipo;
import Modelo.EquipoMiembros;
import Modelo.Miembro;
import Modelo.Tarea;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class ABMTareas extends javax.swing.JInternalFrame {
     private Date fechaSistema = new Date();
    private List<Miembro> array = new ArrayList<>();

    public ABMTareas() {
        initComponents();
        cargandoEquipos();
        cargandoMiembros();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorPrincipal = new javax.swing.JTabbedPane();
        altaDeTarea = new javax.swing.JPanel();
        altaTareaNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        altaTareaDescripcion = new javax.swing.JTextArea();
        btnAltaTareaGuardar = new javax.swing.JButton();
        jcbMiembros = new javax.swing.JComboBox<>();
        jcbEquipos = new javax.swing.JComboBox<>();
        bajaDeTarea = new javax.swing.JPanel();
        bajaTareaListaMiembro = new javax.swing.JComboBox<>();
        bajaTareaListraGrupo = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        bajaTareaDescripcion = new javax.swing.JTextArea();
        btnBajaTarea = new javax.swing.JButton();
        bajaTareaListaTarea = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        btnUpdateTareaActualizar = new javax.swing.JButton();
        updateTareaListaTareas = new javax.swing.JComboBox<>();
        updateTareaListaMiembros = new javax.swing.JComboBox<>();
        updateTareaListaGrupos = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        updateTareaDescripcionTareas = new javax.swing.JTextArea();
        btnCerrar = new javax.swing.JButton();

        altaTareaNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE"));
        altaTareaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaTareaNombreActionPerformed(evt);
            }
        });

        altaTareaDescripcion.setColumns(20);
        altaTareaDescripcion.setRows(5);
        altaTareaDescripcion.setBorder(javax.swing.BorderFactory.createTitledBorder("DESCRIPCION DE LA TAREA"));
        jScrollPane1.setViewportView(altaTareaDescripcion);

        btnAltaTareaGuardar.setText("Crear Tarea");
        btnAltaTareaGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaTareaGuardarActionPerformed(evt);
            }
        });

        jcbEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEquiposActionPerformed(evt);
            }
        });

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
                        .addGap(47, 47, 47)
                        .addComponent(jcbMiembros, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addComponent(btnAltaTareaGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(111, 111, 111))
        );
        altaDeTareaLayout.setVerticalGroup(
            altaDeTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(altaDeTareaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(altaTareaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(altaDeTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbMiembros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(btnAltaTareaGuardar)
                .addGap(23, 23, 23))
        );

        contenedorPrincipal.addTab("Alta de Tarea", altaDeTarea);

        bajaTareaListaMiembro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        bajaTareaListaMiembro.setBorder(javax.swing.BorderFactory.createTitledBorder("MIEMBRO"));
        bajaTareaListaMiembro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaTareaListaMiembroActionPerformed(evt);
            }
        });

        bajaTareaListraGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        bajaTareaListraGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("GRUPO DE TRABAJO"));
        bajaTareaListraGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaTareaListraGrupoActionPerformed(evt);
            }
        });

        bajaTareaDescripcion.setColumns(20);
        bajaTareaDescripcion.setRows(5);
        bajaTareaDescripcion.setBorder(javax.swing.BorderFactory.createTitledBorder("DESCRIPCION DE LA TAREA"));
        jScrollPane2.setViewportView(bajaTareaDescripcion);

        btnBajaTarea.setText("Eliminar Tarea");
        btnBajaTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaTareaActionPerformed(evt);
            }
        });

        bajaTareaListaTarea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        bajaTareaListaTarea.setBorder(javax.swing.BorderFactory.createTitledBorder("TAREA"));
        bajaTareaListaTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaTareaListaTareaActionPerformed(evt);
            }
        });

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

        btnUpdateTareaActualizar.setText("Actualizar Tarea");
        btnUpdateTareaActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateTareaActualizarActionPerformed(evt);
            }
        });

        updateTareaListaTareas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        updateTareaListaTareas.setBorder(javax.swing.BorderFactory.createTitledBorder("TAREA"));
        updateTareaListaTareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateTareaListaTareasActionPerformed(evt);
            }
        });

        updateTareaListaMiembros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        updateTareaListaMiembros.setBorder(javax.swing.BorderFactory.createTitledBorder("MIEMBRO"));
        updateTareaListaMiembros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateTareaListaMiembrosActionPerformed(evt);
            }
        });

        updateTareaListaGrupos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        updateTareaListaGrupos.setBorder(javax.swing.BorderFactory.createTitledBorder("GRUPO DE TRABAJO"));
        updateTareaListaGrupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateTareaListaGruposActionPerformed(evt);
            }
        });

        updateTareaDescripcionTareas.setColumns(20);
        updateTareaDescripcionTareas.setRows(5);
        updateTareaDescripcionTareas.setBorder(javax.swing.BorderFactory.createTitledBorder("DESCRIPCION DE LA TAREA"));
        jScrollPane3.setViewportView(updateTareaDescripcionTareas);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(updateTareaListaTareas, 0, 550, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(updateTareaListaMiembros, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(updateTareaListaGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnUpdateTareaActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(111, 111, 111))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(updateTareaListaTareas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateTareaListaMiembros, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateTareaListaGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnUpdateTareaActualizar)
                .addGap(24, 24, 24))
        );

        contenedorPrincipal.addTab("Actualizar Tarea", jPanel3);

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorPrincipal)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void altaTareaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaTareaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_altaTareaNombreActionPerformed
    // Vista 1 -> Crea una nueva tarea
    private void btnAltaTareaGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaTareaGuardarActionPerformed
        List<Equipo> arrayEquipos = Menu.equipoEscritorio.listarEquiposHabilitados();
        List<EquipoMiembros> arrayEquipoMiembros = Menu.equipoMiembosEscritorio.listarEquiposMiembros();
        List<Miembro> arrayMiembros = new ArrayList<>();
        int posicionEquipoMiembro = -1, idEquipoMiembro, posicionMiembros = -1;

        String nombreTarea = altaTareaNombre.getText();
        String descripcion = altaTareaDescripcion.getText();
        posicionEquipoMiembro = jcbEquipos.getSelectedIndex();
        posicionMiembros = jcbMiembros.getSelectedIndex();

        if (posicionEquipoMiembro != -1) {
            if (!nombreTarea.isEmpty()) {
                if (!descripcion.isEmpty()) {
                    Miembro miembroLocal = new Miembro();
                    int idMiembro = array.get(posicionMiembros).getId_miembro();
                    miembroLocal = Menu.miembroEscritorio.buscarMiembro(idMiembro);
                    arrayMiembros.add(miembroLocal);

                    for (int i = 0; i < arrayEquipoMiembros.size(); i++) {
                        if (arrayEquipoMiembros.get(i).getMiembro().getId_miembro() == idMiembro) {
                            
                           EquipoMiembros equipoMiembrosLocal = new EquipoMiembros();
                            idEquipoMiembro = arrayEquipoMiembros.get(i).getId_equipo_miembros();
                           equipoMiembrosLocal = arrayEquipoMiembros.get(i);
                            LocalDate f = LocalDate.now();
                            System.out.println("id miembro " + idMiembro);
                           System.out.println("id array" + arrayEquipoMiembros.get(i).getMiembro().getId_miembro() );
                          
                         
                             Tarea tareaLocal = new Tarea(nombreTarea, f, f, true, equipoMiembrosLocal);
                           
                           
                            List<Tarea> arraytarea= new ArrayList<>();
                             arraytarea.add(tareaLocal);

                            for (Tarea equipos : arraytarea) {
                                System.out.println(equipos);
                            }
                             
                           Menu.tareaEscritorio.guardarTarea(tareaLocal);
                        }
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Debe ingresar la descripcion de la tarea", "ERROR Validacion", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar el nombre de la tarea", "ERROR Validacion", JOptionPane.WARNING_MESSAGE);
            }
        }


    }//GEN-LAST:event_btnAltaTareaGuardarActionPerformed

    private void bajaTareaListaTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajaTareaListaTareaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bajaTareaListaTareaActionPerformed

    private void bajaTareaListaMiembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajaTareaListaMiembroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bajaTareaListaMiembroActionPerformed

    private void bajaTareaListraGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajaTareaListraGrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bajaTareaListraGrupoActionPerformed

    private void btnBajaTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaTareaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBajaTareaActionPerformed

    private void updateTareaListaTareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateTareaListaTareasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateTareaListaTareasActionPerformed

    private void updateTareaListaMiembrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateTareaListaMiembrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateTareaListaMiembrosActionPerformed

    private void updateTareaListaGruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateTareaListaGruposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateTareaListaGruposActionPerformed

    private void btnUpdateTareaActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateTareaActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateTareaActualizarActionPerformed
    // Vista 1 -> Carga la lista de miembros segun el equipo que se seleccione
    private void jcbEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEquiposActionPerformed
        jcbMiembros.removeAllItems();
        array.clear();
        List<Equipo> arrayEquipos = Menu.equipoEscritorio.listarEquiposHabilitados();
        int posicion = -1;
        posicion = jcbEquipos.getSelectedIndex();
        List<EquipoMiembros> arrayMiembros = Menu.equipoMiembosEscritorio.listarEquiposMiembros();

        if (posicion != -1) {
            for (int i = 0; i < arrayMiembros.size(); i++) {

                if (arrayEquipos.get(posicion).getId_equipo() == arrayMiembros.get(i).getEquipo().getId_equipo()) {

                    Miembro equi = new Miembro();
                    int id = arrayMiembros.get(i).getMiembro().getId_miembro();
                    equi = Menu.miembroEscritorio.buscarMiembro(id);
                    array.add(equi);
                }
            }
        } else {

            JOptionPane.showMessageDialog(null, "Debe seleccionar un equipo", "ERROR Validacion", JOptionPane.WARNING_MESSAGE);
        }
        for (Miembro equipos : array) {
            jcbMiembros.addItem(equipos);
        }

    }//GEN-LAST:event_jcbEquiposActionPerformed

    // Vista 1 -> Carga la lista de  equipos 
    private void cargandoEquipos() {
        jcbEquipos.removeAllItems();
        List<Equipo> arrayEquipos = Menu.equipoEscritorio.listarEquiposHabilitados();

        for (Equipo equipos : arrayEquipos) {
            jcbEquipos.addItem(equipos);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel altaDeTarea;
    private javax.swing.JTextArea altaTareaDescripcion;
    private javax.swing.JTextField altaTareaNombre;
    private javax.swing.JPanel bajaDeTarea;
    private javax.swing.JTextArea bajaTareaDescripcion;
    private javax.swing.JComboBox<String> bajaTareaListaMiembro;
    private javax.swing.JComboBox<String> bajaTareaListaTarea;
    private javax.swing.JComboBox<String> bajaTareaListraGrupo;
    private javax.swing.JButton btnAltaTareaGuardar;
    private javax.swing.JButton btnBajaTarea;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnUpdateTareaActualizar;
    private javax.swing.JTabbedPane contenedorPrincipal;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<Equipo> jcbEquipos;
    private javax.swing.JComboBox<Miembro> jcbMiembros;
    private javax.swing.JTextArea updateTareaDescripcionTareas;
    private javax.swing.JComboBox<String> updateTareaListaGrupos;
    private javax.swing.JComboBox<String> updateTareaListaMiembros;
    private javax.swing.JComboBox<String> updateTareaListaTareas;
    // End of variables declaration//GEN-END:variables

    private void cargandoMiembros() {
        jcbMiembros.removeAllItems();
        /*
        List<EquipoMiembros> arrayMiembros = Menu.equipoMiembosEscritorio.listarEquiposMiembros();

        for (EquipoMiembros equipos : arrayMiembros) {
            jcbMiembros.addItem(equipos);
        }*/
    }
}
