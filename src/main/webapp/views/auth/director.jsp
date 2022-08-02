<%--
  Created by IntelliJ IDEA.
  User: baxtiyor
  Date: 8/2/22
  Time: 9:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<body>
<jsp:include page="../main.jsp"/>
<h1>Director</h1>
<div class="row">
    <div class="col-10 offset-1">
        <button type="button" class="btn btn-success" data-toggle="modal" data-target=".bd-example-modal-lg">
            Add Plane
        </button>

        <div class="modal fade bd-example-modal-lg" id="exampleModal" tabindex="-1" role="dialog"
             aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Add Plane</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <form method="post" action="/plane/add" enctype="multipart/form-data">
                        <div class="modal-body">
                            <div class="container-fluid">
                                <div class="row">
                                    <div class="col-6">

                                        <div class="form-group">
                                            <label for="name">Plane Name</label>
                                            <input type="text" name="name" class="form-control" id="name"/>
                                        </div>

                                    </div>
                                </div>

                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                            <button type="submit" class="btn btn-primary">Save</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <div class="row">
        </div>


    </div>
</div>
</body>
</html>
