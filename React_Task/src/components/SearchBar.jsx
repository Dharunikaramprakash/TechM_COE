import React from "react";
import { Form } from "react-bootstrap";

const SearchBar = ({ search, onSearchChange }) => {
  return (
    <Form className="mb-4">
      <Form.Group>
        <Form.Control
          type="text"
          placeholder="Search for an event..."
          value={search}
          onChange={onSearchChange}
        />
      </Form.Group>
    </Form>
  );
};

export default SearchBar;
