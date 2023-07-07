package Vistas;

import Controlador.TareaData;
import Funciones.Funciones;
import Modelo.Equipo;
import Modelo.EquipoMiembros;
import Modelo.Miembro;
import Modelo.Tarea;
import static java.lang.ProcessBuilder.Redirect.to;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.NativeJava.to;
import jdk.nashorn.internal.parser.DateParser;

public class ABMTareas extends javax.swing.JInternalFrame {

    private Date fechaSistema = new Date();
    private int idTarea;
    private int idMiembroV2 = -1;
    private List<Miembro> listaMiembro = new ArrayList<>();
    private List<Equipo> listaEquipo = new ArrayList<>();
    private List<Tarea> listaTareas = new ArrayList<>();
    private List<EquipoMiembros> listaEquipoMiembros = new ArrayList<>();
    private List<EquipoMiembros> listaEquipoMiembrosGrupos = new ArrayList<>();
    private Miembro miembro = new Miembro();
    private Tarea tarea = new Tarea();
    private Equipo equipo = new Equipo();
    private EquipoMiembros equipoMiembro = new EquipoMiembros();

    private TareaData tareaData = new TareaData();
    
    private int tareaSeleccionada = -1;

    public ABMTareas() {
        initComponents();
        cargandoEquipos();
        actualizandoFecha();
        cargandoEquiposV2();
        Funciones.inicializarCalendario(jdcDateInicio);
        Funciones.inicializarCalendario(jdcDateCierre);
        Funciones.inicializarCalendario(jdcDateInicio_V2);
        Funciones.inicializarCalendario(jdcDateCierre_V2);
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
        jdcDateInicio = new com.toedter.calendar.JDateChooser();
        jdcDateCierre = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnUpdateTareaActualizar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        updateTareaDescripcionTareas = new javax.swing.JTextArea();
        jdcDateInicio_V2 = new com.toedter.calendar.JDateChooser();
        jdcDateCierre_V2 = new com.toedter.calendar.JDateChooser();
        jcbDeshabilitar = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jcbListaTareasHabilitadas = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jcbEquipos_V2 = new javax.swing.JComboBox<>();
        jcbMiembros_V2 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jcbCompletado = new javax.swing.JCheckBox();
        jcbProgreso = new javax.swing.JCheckBox();
        jcbPendiente = new javax.swing.JCheckBox();
        btnCerrar = new javax.swing.JButton();

        altaTareaNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE"));

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

        jcbMiembros.setBorder(javax.swing.BorderFactory.createTitledBorder("Mienbros"));

        jcbEquipos.setBorder(javax.swing.BorderFactory.createTitledBorder("Equipos"));
        jcbEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEquiposActionPerformed(evt);
            }
        });

        jLabel1.setText("Fecha de Inicio");

        jLabel2.setText("Fecha de Cierre");

        javax.swing.GroupLayout altaDeTareaLayout = new javax.swing.GroupLayout(altaDeTarea);
        altaDeTarea.setLayout(altaDeTareaLayout);
        altaDeTareaLayout.setHorizontalGroup(
            altaDeTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, altaDeTareaLayout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addGroup(altaDeTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(altaDeTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(altaDeTareaLayout.createSequentialGroup()
                            .addComponent(jcbEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbMiembros, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(altaTareaNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE))
                    .addGroup(altaDeTareaLayout.createSequentialGroup()
                        .addGroup(altaDeTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdcDateInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(191, 191, 191)
                        .addGroup(altaDeTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdcDateCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addComponent(btnAltaTareaGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111))
        );
        altaDeTareaLayout.setVerticalGroup(
            altaDeTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(altaDeTareaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(altaTareaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(altaDeTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbMiembros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(altaDeTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(altaDeTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdcDateInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcDateCierre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnAltaTareaGuardar)
                .addGap(23, 23, 23))
        );

        contenedorPrincipal.addTab("Alta de Tarea", altaDeTarea);

        btnUpdateTareaActualizar.setText("Actualizar Tarea");
        btnUpdateTareaActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateTareaActualizarActionPerformed(evt);
            }
        });

        updateTareaDescripcionTareas.setColumns(20);
        updateTareaDescripcionTareas.setRows(5);
        updateTareaDescripcionTareas.setBorder(javax.swing.BorderFactory.createTitledBorder("DESCRIPCION DE LA TAREA"));
        jScrollPane3.setViewportView(updateTareaDescripcionTareas);

        jcbDeshabilitar.setText("Deshabilitar");
        jcbDeshabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbDeshabilitarActionPerformed(evt);
            }
        });

        jLabel3.setText("Fecha de Inicio");

        jLabel4.setText("Fecha de cierre");

        jcbListaTareasHabilitadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbListaTareasHabilitadasActionPerformed(evt);
            }
        });

        jLabel5.setText("Tarea");

        jcbEquipos_V2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEquipos_V2ActionPerformed(evt);
            }
        });

        jcbMiembros_V2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMiembros_V2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Miembros");

        jLabel7.setText("Equipos");

        jcbCompletado.setText("Completado");
        jcbCompletado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCompletadoActionPerformed(evt);
            }
        });

        jcbProgreso.setText("Progreso");
        jcbProgreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbProgresoActionPerformed(evt);
            }
        });

        jcbPendiente.setText("Pendiente");
        jcbPendiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPendienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jdcDateInicio_V2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jdcDateCierre_V2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbProgreso)
                                    .addComponent(jcbPendiente)
                                    .addComponent(jcbCompletado)))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbDeshabilitar))
                    .addComponent(btnUpdateTareaActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(18, 18, 18)))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jcbEquipos_V2, 0, 481, Short.MAX_VALUE)
                                        .addComponent(jcbMiembros_V2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcbListaTareasHabilitadas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(152, 152, 152))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbEquipos_V2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcbMiembros_V2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbListaTareasHabilitadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbPendiente)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jdcDateInicio_V2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jdcDateCierre_V2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jcbProgreso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbCompletado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jcbDeshabilitar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
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

    /*|---------------------|*/
 /*|    Regeneradores    |*/
 /*|---------------------|*/
    private Miembro regenerarMiembro(int idMiembro) {
        miembro = Menu.miembroDataLocal.buscarMiembro(idMiembro);
        return miembro;
    }

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed
    // Vista 1 -> Crea una nueva tarea
    private void btnAltaTareaGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaTareaGuardarActionPerformed
        listaEquipo = Menu.equipoDataLocal.listarEquiposHabilitados();
        listaEquipoMiembros = Menu.equipoMiembosDataLocal.listarEquiposMiembros();

        int posicionMiembros = -1; // se debe poner en una linea una vez limpio
        int posicionEquipoMiembro = -1;
        int idMiembros = -1;
        int idEquipo = -1;

        String nombreTarea = altaTareaNombre.getText();
        String descripcion = altaTareaDescripcion.getText();
        LocalDate fechaInicio = jdcDateInicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fechaCierre = jdcDateCierre.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        posicionMiembros = jcbMiembros.getSelectedIndex();
        posicionEquipoMiembro = jcbEquipos.getSelectedIndex();
        int estado = 1;
        if (posicionEquipoMiembro != -1) {
            if (!nombreTarea.isEmpty()) {
                if (!descripcion.isEmpty()) {

                    int idMiembro = listaMiembro.get(posicionMiembros).getId_miembro();
                    miembro = regenerarMiembro(idMiembro);
                    listaMiembro.add(miembro);

                    //  System.out.println(listaEquipoMiembros.size());
                    for (int i = 0; i < listaEquipoMiembros.size(); i++) {

                        if (listaEquipoMiembros.get(i).getMiembro().getId_miembro() == idMiembro) {

                            idMiembros = listaEquipoMiembros.get(i).getMiembro().getId_miembro();
                            idEquipo = listaEquipo.get(posicionEquipoMiembro).getId_equipo();

                            equipoMiembro = Menu.equipoMiembosDataLocal.buscarEquipoAndMiembros(idMiembros, idEquipo);

                            if (fechaInicio.isEqual(fechaCierre) || fechaInicio.isBefore(fechaCierre)) {

                                Tarea tareaLocal = new Tarea(nombreTarea, fechaInicio, fechaCierre, estado, descripcion, equipoMiembro);
                                Menu.tareaDataLocal.guardarTarea(tareaLocal);

                                limpiar();
                                break;
                            } else {
                                JOptionPane.showMessageDialog(null, "La fecha de cierre debe ser la misma y despues que la fecha de inicio", "ERROR Validacion", JOptionPane.WARNING_MESSAGE);

                            }
                        }
                    }

                } else {
                    JOptionPane.showMessageDialog(null, Menu.ERROR_DESCRIPCION, Menu.TT_ERROR_VALIDACION, JOptionPane.WARNING_MESSAGE);
                    altaTareaDescripcion.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(null, Menu.ERROR_NOMBRE, Menu.TT_ERROR_VALIDACION, JOptionPane.WARNING_MESSAGE);
                altaTareaNombre.requestFocus();
            }
        }


    }//GEN-LAST:event_btnAltaTareaGuardarActionPerformed

    // Solapa 2 -> boton actualizar tarea
    private void btnUpdateTareaActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateTareaActualizarActionPerformed
        int miembro = -1;
        miembro = jcbMiembros_V2.getSelectedIndex();

        if (jcbDeshabilitar.isSelected()) {
            Menu.tareaDataLocal.eliminarTarea(idTarea);
            cargarYLimpiar();
            updateTareaDescripcionTareas.setText("");
            jcbDeshabilitar.setSelected(false);
        } else {
            jcbDeshabilitar.setSelected(false);
            String descripcion = updateTareaDescripcionTareas.getText();
            LocalDate fechaInicio = jdcDateInicio_V2.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fechaCierre = jdcDateCierre_V2.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            if (!descripcion.isEmpty()) {
                if (fechaInicio.isEqual(fechaCierre) || fechaInicio.isBefore(fechaCierre)) {
                    if (tareaSeleccionada > -1) {
                        Tarea tareas = Menu.tareaDataLocal.buscarTarea(idTarea);
                        tareas.setDescripcion(descripcion);
                        tareas.setFecha_creacion(fechaInicio);
                        tareas.setFecha_cierre(fechaCierre);

                        if (jcbPendiente.isSelected()) {
                            jcbProgreso.setSelected(false);
                            jcbCompletado.setSelected(false);
                            tareas.setEstado(1);
                        } else if (jcbProgreso.isSelected()) {
                            jcbPendiente.setSelected(false);
                            jcbCompletado.setSelected(false);
                            tareas.setEstado(2);
                        } else {
                            jcbProgreso.setSelected(false);
                            jcbPendiente.setSelected(false);
                            tareas.setEstado(3);
                        }

                        Menu.tareaDataLocal.actualizarTarea(tareas);
                    
                    }else {
                        JOptionPane.showMessageDialog(null, "Debe seleccionar una tarea", Menu.TT_ERROR, JOptionPane.WARNING_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "La fecha de cierre debe ser la misma y despues que la fecha de inicio", "ERROR Validacion", JOptionPane.WARNING_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar una descripcion", "ERROR Validacion", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnUpdateTareaActualizarActionPerformed
    // Vista 1 -> Carga la lista de miembros segun el equipo que se seleccione
    private void jcbEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEquiposActionPerformed
        jcbMiembros.removeAllItems();
        listaMiembro.clear();

        listaEquipo = Menu.equipoDataLocal.listarEquiposHabilitados();
        int posicion = -1;

        posicion = jcbEquipos.getSelectedIndex();
        listaEquipoMiembros = Menu.equipoMiembosDataLocal.listarEquiposMiembros();

        if (posicion != -1) {
            for (int i = 0; i < listaEquipoMiembros.size(); i++) {

                if (listaEquipo.get(posicion).getId_equipo() == listaEquipoMiembros.get(i).getEquipo().getId_equipo()) {
                    int id = listaEquipoMiembros.get(i).getMiembro().getId_miembro();
                    miembro = Menu.miembroDataLocal.buscarMiembro(id);
                    listaMiembro.add(miembro);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, Menu.ERROR_EQUIPO_SELECT, Menu.TT_ERROR_VALIDACION, JOptionPane.WARNING_MESSAGE);
        }
        for (Miembro equipos : listaMiembro) {
            jcbMiembros.addItem(equipos);
        }

    }//GEN-LAST:event_jcbEquiposActionPerformed

//Solapa 2 -> carga la lista de miembros segun el equipo
    private void jcbEquipos_V2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEquipos_V2ActionPerformed
        jcbMiembros_V2.removeAllItems();
        listaMiembro.clear();
        updateTareaDescripcionTareas.setText("");

        listaEquipo = Menu.equipoDataLocal.listarEquiposHabilitados();
        int posicion = -1;

        posicion = jcbEquipos_V2.getSelectedIndex();
        listaEquipoMiembros = Menu.equipoMiembosDataLocal.listarEquiposMiembros();

        if (posicion != -1) {
            for (int i = 0; i < listaEquipoMiembros.size(); i++) {

                if (listaEquipo.get(posicion).getId_equipo() == listaEquipoMiembros.get(i).getEquipo().getId_equipo()) {
                    int id = listaEquipoMiembros.get(i).getMiembro().getId_miembro();
                    miembro = Menu.miembroDataLocal.buscarMiembro(id);
                    listaMiembro.add(miembro);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, Menu.ERROR_EQUIPO_SELECT, Menu.TT_ERROR_VALIDACION, JOptionPane.WARNING_MESSAGE);
        }
        for (Miembro equipos : listaMiembro) {
            jcbMiembros_V2.addItem(equipos);
        }
    }//GEN-LAST:event_jcbEquipos_V2ActionPerformed

//Solapa 2 -> carga la lista de tareas segun el miembro    
    private void jcbMiembros_V2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMiembros_V2ActionPerformed
        jcbListaTareasHabilitadas.removeAllItems();
        listaTareas.clear();
        updateTareaDescripcionTareas.setText("");
        
        List<Tarea> tareasLista = Menu.tareaDataLocal.listarTareasHabilitadas();

        int miembro = jcbMiembros_V2.getSelectedIndex();

        int idTarea = -1;

        try {
            for (int i = 0; i < tareasLista.size(); i++) {

                if (tareasLista.get(i).getEquipoMiembros().getMiembro().getId_miembro()
                        == listaMiembro.get(miembro).getId_miembro()) {
                    idMiembroV2 = listaMiembro.get(miembro).getId_miembro();
                    idTarea = tareasLista.get(i).getId_tarea();
                    tarea = Menu.tareaDataLocal.buscarTarea(idTarea);
                    listaTareas.add(tarea);
                    jcbListaTareasHabilitadas.addItem(tarea.getNombre());

                } else {
                    continue;
                }
            }

        } catch (Exception e) {
            System.out.println("no entro");
        }

    }//GEN-LAST:event_jcbMiembros_V2ActionPerformed
//Solapa 2 -> carga los datos de la lista de tareas  
    private void jcbListaTareasHabilitadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbListaTareasHabilitadasActionPerformed
        jcbPendiente.setSelected(false);
        jcbProgreso.setSelected(false);
        jcbCompletado.setSelected(false);
        tareaSeleccionada = jcbListaTareasHabilitadas.getSelectedIndex();
        
        if (tareaSeleccionada != -1) {
            idTarea = listaTareas.get(tareaSeleccionada).getId_tarea();
            updateTareaDescripcionTareas.setText(listaTareas.get(tareaSeleccionada).getDescripcion());
            jdcDateInicio_V2.setDateFormatString(listaTareas.get(tareaSeleccionada).getFecha_creacion() + "");
            jdcDateCierre_V2.setDateFormatString(listaTareas.get(tareaSeleccionada).getFecha_cierre() + "");
            int estado = listaTareas.get(tareaSeleccionada).getEstado();
            switch (estado) {
                case 1:
                    jcbPendiente.setSelected(true);
                    jcbProgreso.setSelected(false);
                    jcbCompletado.setSelected(false);
                    break;
                case 2:
                    jcbPendiente.setSelected(false);
                    jcbProgreso.setSelected(true);
                    jcbCompletado.setSelected(false);
                    break;
                case 3:
                    jcbPendiente.setSelected(false);
                    jcbProgreso.setSelected(false);
                    jcbCompletado.setSelected(true);
                    break;
            }

        } else {
            //JOptionPane.showMessageDialog(null, "Debe seleccionar una tarea");
        }

    }//GEN-LAST:event_jcbListaTareasHabilitadasActionPerformed

    private void jcbCompletadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCompletadoActionPerformed
        jcbPendiente.setSelected(false);
        jcbProgreso.setSelected(false);
        jcbCompletado.setSelected(true);
        jcbDeshabilitar.setSelected(false);
    }//GEN-LAST:event_jcbCompletadoActionPerformed

    private void jcbPendienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPendienteActionPerformed
        jcbPendiente.setSelected(true);
        jcbProgreso.setSelected(false);
        jcbCompletado.setSelected(false);
        jcbDeshabilitar.setSelected(false);
    }//GEN-LAST:event_jcbPendienteActionPerformed

    private void jcbProgresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbProgresoActionPerformed
        jcbPendiente.setSelected(false);
        jcbProgreso.setSelected(true);
        jcbCompletado.setSelected(false);
        jcbDeshabilitar.setSelected(false);
    }//GEN-LAST:event_jcbProgresoActionPerformed

    private void jcbDeshabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbDeshabilitarActionPerformed
        jcbPendiente.setSelected(false);
        jcbProgreso.setSelected(false);
        jcbCompletado.setSelected(false);
        jcbDeshabilitar.setSelected(true);
    }//GEN-LAST:event_jcbDeshabilitarActionPerformed

    private void limpiarVista2() {
        jcbEquipos_V2.removeAllItems();
        jcbMiembros_V2.removeAllItems();
        updateTareaDescripcionTareas.setText("");
        jdcDateInicio_V2.setCalendar(null);
        jdcDateCierre_V2.setCalendar(null);
        jcbDeshabilitar.setSelected(false);
        listaEquipo.clear();
        listaEquipoMiembros.clear();
        listaMiembro.clear();
    }

    // Vista 1 -> Carga la lista de  equipos 
    private void cargandoEquipos() {
        jcbEquipos.removeAllItems();
        List<Equipo> arrayEquipos = Menu.equipoDataLocal.listarEquiposHabilitados();

        for (Equipo equipos : arrayEquipos) {
            jcbEquipos.addItem(equipos);
        }

    }

    // Vista 2 -> Carga la lista de  equipos 
    private void cargandoEquiposV2() {
        jcbEquipos_V2.removeAllItems();
        List<Equipo> arrayEquipos = Menu.equipoDataLocal.listarEquiposHabilitados();

        for (Equipo equipos : arrayEquipos) {
            jcbEquipos_V2.addItem(equipos);
        }

    }

    //Solapa 1 -> Limpiar campos
    private void limpiar() {
        altaTareaNombre.setText("");
        jcbEquipos.setSelectedIndex(0);
        jcbMiembros.setSelectedIndex(0);
        altaTareaDescripcion.setText("");
        jdcDateInicio.setDate(new Date());
        jdcDateCierre.setDate(new Date());
        jdcDateCierre.setCalendar(null);

    }

    public void formatoCalendario() {
        jdcDateInicio_V2.setDate(new Date());
        jdcDateCierre_V2.setDate(new Date());
    }

    public void cargarYLimpiar() {
        cargandoEquiposV2();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel altaDeTarea;
    private javax.swing.JTextArea altaTareaDescripcion;
    private javax.swing.JTextField altaTareaNombre;
    private javax.swing.JButton btnAltaTareaGuardar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnUpdateTareaActualizar;
    private javax.swing.JTabbedPane contenedorPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JCheckBox jcbCompletado;
    private javax.swing.JCheckBox jcbDeshabilitar;
    private javax.swing.JComboBox<Equipo> jcbEquipos;
    private javax.swing.JComboBox<Equipo> jcbEquipos_V2;
    private javax.swing.JComboBox<String> jcbListaTareasHabilitadas;
    private javax.swing.JComboBox<Miembro> jcbMiembros;
    private javax.swing.JComboBox<Miembro> jcbMiembros_V2;
    private javax.swing.JCheckBox jcbPendiente;
    private javax.swing.JCheckBox jcbProgreso;
    private com.toedter.calendar.JDateChooser jdcDateCierre;
    private com.toedter.calendar.JDateChooser jdcDateCierre_V2;
    private com.toedter.calendar.JDateChooser jdcDateInicio;
    private com.toedter.calendar.JDateChooser jdcDateInicio_V2;
    private javax.swing.JTextArea updateTareaDescripcionTareas;
    // End of variables declaration//GEN-END:variables

//Solapa 1 -> Actuliza la fecha
    private void actualizandoFecha() {
        Calendar c2 = new GregorianCalendar();
        jdcDateInicio.setCalendar(c2);
    }

}
